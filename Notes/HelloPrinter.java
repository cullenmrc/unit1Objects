
/**
 * Every Java program contains one or more classes (e.g., HelloPrinter)
 * 
 * In general, every source file (HelloPrinter.java) contains one
 *  class (HelloPrinter).
 * 
 * The source file name must match class name.
 * 
 * By convention, class names start with a uppercase letter
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelloPrinter
{
    /* A class contains methods.
     * 
     * Every Java application contains a class with a main method.
     * 
     * The main method is executed when the application starts.
     */
    public static void main( String[] args )
    {
        /* A method contains statements.
         * 
         * Statements may invoke other methods (e.g., println).
         * 
         * In general, methods are invoked on objects (e.g., System.out).
         * 
         * When invoking a method, arguments are passed in parentheses
         *  (e.g., "Hello World!").
         */
        System.out.println( "Hello, World!" );

        // this is a single-line comment

        /* Identifiers are any combination of
         *      letters
         *      digits (but not as first character)
         *      underscores
         *      dollar signs
         *      
         *  These are various identifiers:
         */
        int y, x2, x_y, x$;

        // This is not a valid identifier:
        //int 2y;

        /* Identifiers are case sensitive (case matters). These are
         *  three different identifiers:
         */
        String box, BOX, Box;

        /* By convention, constants are all uppercase
         *      Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000;

        /* By convention, all other identifiers start with a lowercase
         * letter.
         * 
         * Subsequent words start with a uppercase letter (CamalCase)
         */
        String firstName;
        
        /* This is a compile-time error. (This code doesn't even compile.)
         * 
         */
        //System.ou.println( "Hello, World!" );
        
        /* This is a run-time error. (This code compiles and run, 
         *      but it doesn't produced the expected output.)
         *      
         *  More specificially, this is a logical error:
         */
        System.out.println( "Hello, Word!" );
        
        /* This is also a run-time error.
         * 
         * More specifically, this error generates an exception.
         * (The program crashes in most cases.)
         */
        System.out.println( 1/0 );
    }
}



