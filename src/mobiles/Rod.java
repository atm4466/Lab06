package mobiles;

/**
 * Represent a rod in the mobile tree.
 *
 * @author RIT CS
 * @author Andrew Moor
 */
public class Rod implements Node{
    // TODO
    //Vars
    private String name;
    private int cord_len;
    private int left_len;
    private int right_len;
    private Node right_node;
    private Node left_node;
    //Constructor
    public Rod(String a, int b, int c, int d, Node e, Node f){
        name = a;
        cord_len =b;
        left_len = c;
        right_len = d;
        left_node = e;
        right_node = f;

    }
    //returns cord len
    public int getCordLength()
    {
        return cord_len;
    }
    //returns the weight of THE ENTIRE SUBTREE!
    @Override
    public int getWeight(){
        return right_node.getWeight()+left_node.getWeight();


    }
    //returns the imbalance.
    @Override
    public int getImbalance() {

        int LTORQUE  = (int)left_len*left_node.getWeight();
        int RTOQUE = (int)right_len*right_node.getWeight();
        //This should be fine assuming it can be negative or posotive difference.
        return LTORQUE - RTOQUE;
    }
    //returns cord len, wait hold on this is already made :P
    public int getCord_len()
    {
        return cord_len;
    }
    //if imbalance is 0 then this should return true, but we calculate it anyway.
    @Override
    public boolean isBalanced()
    {

        if((left_node.getWeight()*left_len) == (right_node.getWeight()*right_len))
        {
            return true;

        }
        return false;
    }
    //returns left node
    public Node getLeft_node()
    {
        return left_node;
    }
    //returns right node
    public Node getRight_node()
    {
        return right_node;

    }
    //toString for rod according to the instructions. this is similar to python f string.
    @Override
    public String toString()
    {

        return String.format("Rod(name=%s, cord=%d, leftArm=%d, leftChild=%s, " +
                        "rightArm=%d, rightChild=%s)",
                name, cord_len, left_len, left_node, right_len, right_node);
    }

    //Rod(name={NAME}, cord=#, leftArm=#, leftChild={LEFT_CHILD}, rightArm=#, rightChild={RIGHT_CHILD})

}
