package mobiles;

/**
 * Represent a rod in the mobile tree.
 *
 * @author RIT CS
 * @author YOUR NAME HERE
 */
public class Rod {
    // TODO
    private String name;
    private int cord_len;
    private int left_len;
    private int right_len;
    private Node right_node;
    private Node left_node;

    public Rod(String a,int b, int c, int d, Node e, Node f){
        name = a;
        cord_len =b;
        left_len = c;
        right_len = d;
        left_node = e;
        right_node = f;

    }

    
}
