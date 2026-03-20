package mobiles;

/**
 * Represent a rod in the mobile tree.
 *
 * @author RIT CS
 * @author Andrew Moor
 */
public class Rod implements Node{
    // TODO
    private String name;
    private int cord_len;
    private int left_len;
    private int right_len;
    private Node right_node;
    private Node left_node;

    public Rod(String a, int b, int c, int d, Node e, Node f){
        name = a;
        cord_len =b;
        left_len = c;
        right_len = d;
        left_node = e;
        right_node = f;

    }

    @Override
    public int get_Weight(){
        return right_node.getWeight()+left_node.getWeight();


    }

    public int getCord_len()
    {
        return cord_len;
    }

    @Override
    public boolean is_balanced()
    {

        if((left_node.getWeight()*left_len) == (right_node.getWeight()*right_len))
        {
            return true;

        }
        return false;
    }
    public Node getLeft_node()
    {
        return left_node;
    }
    public Node getRight_node()
    {
        return right_node;

    }
    @Override
    public String toString()
    {

        return String.format("Rod(name=%s, cord=%d, leftArm=%d, leftChild=%s, " +
                        "rightArm=%d, rightChild=%s)",
                name, cord_len, left_len, left_node, right_len, right_node);
    }
    
    //Rod(name={NAME}, cord=#, leftArm=#, leftChild={LEFT_CHILD}, rightArm=#, rightChild={RIGHT_CHILD})

}
