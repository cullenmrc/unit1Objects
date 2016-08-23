
/**
 * This source file contains the HelloPrinter class.
 *  (in general, a source file contains exactly one class)
 *  By convention, class names start with a uppercase letter
 * 
 * The name of the source file has to match the name of the class
 *  (e.g., HelloPrinter.java)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelloPrinter
{
    /* A class contains methods.
     * Every Java application has a class with the main method.
     * The main method is executed when the application starts.
     */
    public static void main( String[] args )
    {
        /* A method contains statements.
         * Statements can invoke other methods (e.g., println).
         * Methods are usually invoked on objects (e.g., System.out).
         * When we invoke a method, arguments are passed in parentheses
         *  (e.g., "Hello World!")
         */
        System.out.println( "Hello World!" );

        // this is a single-line comment

        /* identifiers are words and are any combination of:
         *      letters
         *      digits (not first character)
         *      underscores
         *      dollar signs
         *      
         * These are valid identifiers:
         */
        int x, y2, x_y, x$;

        // this is not a valid identifier:
        // int 2x;

        // Case matters! These identifiers are all different:
        String box, BOX, Box;

        // By convention, constants are all uppercase
        int SPEED_OF_LIGHT = 300000000;

        /* By convention, all other identifiers start with a lowercase
         *  and capitalize subsequent words (CamelCase)
         */
        String firstName;
        
        /* This is a compile-time error. (This code doesn't even compile.)
         * 
         * This includes syntax errors and some semantic error.
         * 
         */
        //System.ou.println( "Hello, World!" );
        
        /* This is a run-time error. (This code compiles, but doesn't
         * produce the expected output when run.)
         * 
         * More specifically, this is a logical error. (The program
         * runs, doesn't crash, but doesn't produce the expected output.)
         */
        System.out.println( "Hello, Word!" );
        
        /* This is a run-time error.
         * 
         * More specifically, this generates an exception. (In general,
         * exceptions cause the program to crash.)
         */
        // System.out.println( 1/0 );

    }
}



