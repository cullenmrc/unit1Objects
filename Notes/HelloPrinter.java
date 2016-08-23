
/**
 * Write a description of class HelloPrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// this is a single line comment

/* this is a multi
 * line
 * comment
 */

// this line declares the class HelloPrinter
public class HelloPrinter
{
    /* this line declares the main method, which is run when when
     * the program runs
     */
    // public is an identifier defined by the Java language
    public static void main( String[] args )
    {
        /* a body of a method contains statements; this line is a statement
         * in general, methods (e.g., println) are
         * called on objects (e.g., System.out)
         * parameters (e.g., "Hello, World!") are passed within parenthesis
         * println is an identifier defined by the Java Standard Library
         */
        System.out.println( "Hello, World!" );
        
        // x is an identifier defined by me
        int x;
        
        /* identifier can have letters, digits (but not first),
         * underscores, and dollar signs (not don't use dollar signs)
         */
        int y, x2, x_y, xy$;
        
        // this won't compile
        // int 2y;
        
        /* identifiers are case sensitive
         * These identifiers are all different
         */
        String box, BOX, Box;
        
        /* There are conventions for identifiers (not rules)
         * Classes start with an upper case letter;
         * Constants are all upper case
         * everything else starts with a lower case letter
         *  (mixed case for words)
         */
        int SPEED_OF_LIGHT = 300000000;
        String firstName;
        
        /* This is a compile-time error. (The code doesn't even compile.)
         * This includes syntax errors and some sematic error.
         */
        //System.ou.println( "Hello, World!" );
        
        /* This is a run-time error. (The program generates the error
         *  when it is executed.)
         *  More specificially, this a logical error. (The program doesn't
         *  crash, but it doesn't work as expected.)
         */
        System.out.println( "Hello, Word!" );
        
        /* This is also a run-time error. More specifically, it is an
         * exception. (The program crashes, in general.)
         */
        //System.out.println( 1/0 );
    }
}




