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

}
