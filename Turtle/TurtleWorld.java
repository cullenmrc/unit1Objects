import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        /*
         * Variables store values to be used later.
         *      Variables have a type (int), a name (width), and a value (1800)
         */
        int width = 1800;
        
        /*
         * Objects are entities in a program.
         *      Objects have properties (attributes).
         *      Objects are manipulated by invoking methods.
         *      
         *  turtleWorld and turtle reference objects
         *  
         *  Classes describe a collection of objects.
         *      All objects of a class have the same behavior (methods)
         *      and have the same types of properties (but may have different values)
         *      
         *  World and Turtle are classes
         */
        World turtleWorld = new World();
        
        /*
         * We use the new operator to construct (create) an object.
         *  The class of the object is specified immediately after the
         *      new operator (e.g. Turtle).
         *  If we have to pass addition information to create the object,
         *      arguments are specified in parentheses after the class
         *      (e.g., turtleWorld).
         *  A reference to the newly created object is returned by the new
         *      operator.
         */
        Turtle turtle = new Turtle(turtleWorld);
        
        /* 
         * When invoking methods, we use the dot operator to invoke method on
         *      an object.
         *   Some methods take no arguments, but we still have parentheses
         *      (e.g., penDown)
         *   Some methods take one or more arguments (e.g., forward)
         *   
         *   Mutator methods modify the state (i.e. properties) of the object.
         *      setPenColor, penDown, and forward are all mutator methods
         */
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        
        /*
         * Accessor methods return a property of the object.
         *  The state of the object does not change.
         *  
         *  getPenWidth is an accessor method.
         */
        int penWidth = turtle.getPenWidth();
        
        /*
         * Java has several primitive data types:
         *      boolean holds a value of true or false
         *      int holds a integer number
         *      double holds a real number (floating point)
         *      char holds a single character
         */
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double taxRate = 0.075;
        
        // here is a char
        char letter = 'c';
    }
}






