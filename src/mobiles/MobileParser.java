package mobiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 * The class who parses the mobile file and builds the mobile tree.
 *
 * @author RIT CS
 * @author Andrew Moor
 */
public class MobileParser {
    /** the root node */
    private final Node root;
    /** file field for BALL */
    private final static String BALL = "BALL";
    /** file field for ROD */
    private final static String ROD = "ROD";

    /**
     * Build a parser that eventually will require the mobile tree to be fully balanced.
     * @param filename the mobile filename
     * @throws IOException an IO error occurs reading from the file
     */
    public MobileParser(String filename) throws Exception {
        try (BufferedReader in = new BufferedReader(new FileReader(filename))){
            this.root = parse(in);
        } // <3 Jim
    }

    /**
     * The recursive parser for building the mobile tree from the mobile file.
     * @param in a buffered reader attached to the mobile file for reading
     * @return a parsed Node of the mobile tree
     * @throws IOException an IO error occurs reading from the file
     */
    private Node parse(BufferedReader in) throws Exception {
        String line = in.readLine();

        if (line == null) {
            throw new MobileException("Unexpected end of file");
        }

        line = line.trim();
        if (line.isEmpty()) {
            return parse(in);   // skip blank lines
        }

        String[] fields = line.split("\\s+");

        if (Objects.equals(fields[0], ROD)) {
            String name = fields[1];
            int cord_len = Integer.valueOf(fields[2]);
            int left_len = Integer.valueOf(fields[3]);
            int right_len = Integer.valueOf(fields[4]);

            Node left_node = parse(in);
            Node right_node = parse(in);

            return new Rod(name, cord_len, left_len, right_len, left_node, right_node);
        }
        else if (Objects.equals(fields[0], BALL)) {
            String name = fields[1];
            int cord_len = Integer.valueOf(fields[2]);
            int radius = Integer.valueOf(fields[3]);
            int weight = Integer.valueOf(fields[4]);

            return new Ball(name, cord_len, radius, weight);
        }
        else {
            throw new MobileException("Unknown node type: " + fields[0]);
        }
    }

    /**
     * Get the root node of the parsed mobile.
     * @return the root
     */
    public Node getRoot() {
        return this.root;
    }
}
