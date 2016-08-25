import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        /* Variables store values to be used later.
         *      Variables have a type (int), a name (width), and a value (1800)
         */
        int width = 1800;
        
        /* Objects are entities in a program.
         *      Objects have properities (attributes)
         *      Objects are manipulated by invoking methods
         *  
         *   turtleWorld and turtle reference objects.
         *  
         *  Classes describe a collection of objects.
         *      The objects of a class have the same behavior (methods)
         *          and have the same types of properties (not necessary values)
         *   
         *   World and Turtle are classes.
         */
        World turtleWorld = new World();
        
        /* Objects are constructed (created) using the new operator.
         *  The class of object to be constructed is specified after the new operator.
         *  Any arguements used in construction are passed in parentheses.
         *  The new operator returns a refernce to the newly created object.
         */
        Turtle turtle = new Turtle(turtleWorld);
        
        /* Methods are called on objects using the . (dot) operator.
         *  Some methods take arguments (setPenColor)
         *  Some methods don't take arguments (penDown)
         *  
         *  Mutator methods modify the state (properties) of the object.
         *  setPenColor, penDown, and forward are all mutator methods
         */
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        
        /* Accessor methods return a property of the object.
         *      They do not change the state of the object.
         *      
         *  getPenWidth is an accessor method
         */
        int penWidth = turtle.getPenWidth();
        
        /* Variables either refernce objects or are primitive data types.
         * 
         * Examples of primitive data types:
         */
        
        // a boolean holds a value of true or false
        boolean isSummer = true;
        
        // a int holds an integer value
        int depth = 10;
        
        // a double holds a real number (floating point)
        double fraction = 0.8;
        
        // a char holds a single character
        char letter = 'd';
    }
}






