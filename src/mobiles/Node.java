package mobiles;

/**
 * A node in the mobile tree.
 *
 * @author RIT CS
 * @author Andrew Moor
 */
public abstract interface Node {
    // TODO

    //Ball and Rod will need these implemented classes

    public abstract int getWeight();
    public abstract boolean isBalanced();
    public int getImbalance();
    public String toString();


}
