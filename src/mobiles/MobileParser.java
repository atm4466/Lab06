package mobiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 * The class who parses the mobile file and builds the mobile tree.
 *
 * @author RIT CS
 * @author YOUR NAME HERE
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
    public MobileParser(String filename) throws IOException {
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
    private Node parse(BufferedReader in) throws IOException {
        // TODO
        /*  Example Mobile File for Reference, all files (preorderd!!!)
                ROD ROD_A 70 60 90
                BALL BALL_A 50 30 90
                ROD ROD_B 170 100 50
                BALL BALL_B 90 40 20
                BALL BALL_C 60 35 40
         */

        String line = in.readLine();
        String[] fields = line.split("\\st");

        if(Objects.equals(fields[0], "ROD")){
            //your objective here(String a,int b, int c, int d, Node e, Node f)
            Rod rod = new Rod(fields[1], Integer.valueOf(fields[2]),Integer.valueOf(fields[3]),Integer.valueOf(fields[4]),parse(in),parse(in));
        }
        else if(Objects.equals(fields[0], "Ball"))
        {
            //(String a, int b, int c, int d)
            Ball ball = new Ball(fields[1],Integer.valueOf(fields[2]),Integer.valueOf(fields[3]),Integer.valueOf(fields[4]));
        }

        return null;
    }

    /**
     * Get the root node of the parsed mobile.
     * @return the root
     */
    public Node getRoot() {
        return this.root;
    }
}
