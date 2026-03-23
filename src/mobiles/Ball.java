package mobiles;

/**
 * Represents a ball in the mobile tree.
 *
 * @author RIT CS
 * @author Andrew Moor
 */
public class Ball implements Node{
    //Vars
    private final String name;
    private final int cord_len;
    private final int radius;
    private final int weight;

    //constructor for ball according to the instructions.
    public Ball(String a, int b, int c, int d)
    {
        name = a;
        cord_len = b;
        radius = c;
        weight = d;
    }
    //returns the name
    public String getName()
    {
        return name;
    }
    //returns cord len
    public int getCord_len()
    {
        return cord_len;
    }

    //This returns the weight passed to it from the input files.
    @Override
    public int getWeight()
    {
        return weight;
    }
    //Ball is always ballanced
    @Override
    public boolean isBalanced()
    {
        return true;

    }
    //This is the toString asked by the instructions
    @Override
    public String toString()
    {
        return "Ball(name=" + name + ", cord=" + cord_len +", radius=" + radius +", weight=" + weight + ")";

    }
    //Ball has no imbalance so its zero.
    @Override
    public int getImbalance() {
        return 0;

        //The ball class has 0 imblance as its the end.
    }
    //Ball(name={NAME}, cord=#, radius=#, weight=#)
}
