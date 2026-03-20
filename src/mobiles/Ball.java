package mobiles;

/**
 * Represents a ball in the mobile tree.
 *
 * @author RIT CS
 * @author Andrew Moor
 */
public class Ball implements Node{
    private String name;
    private int cord_len;
    private int radius;
    private int weight;

    public Ball(String a, int b, int c, int d)
    {
        name = a;
        cord_len = b;
        radius = c;
        weight = d;
    }

    public String getName()
    {
        return name;
    }
    public int getCord_len()
    {
        return cord_len;
    }

    @Override
    public int getWeight()
    {
        return weight;
    }
    @Override
    public boolean isBalanced()
    {
        return true;

    }
    //Ball(name={NAME}, cord=#, radius=#, weight=#)
}
