import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        /* Objects are entities in a program.
         *  Objects have properties (attributes).
         *  Objects are manipulated by invoking methods.
         *  
         *  turtleWorld and turtle are variables that reference objects
         *  
         *  Classes describe a collection of objects that have the same
         *      behavior (methods) and the types of properties.
         *  
         *  World and Turtle are classes.
         */
        World turtleWorld = new World();
        
        /* This is how we construct objects.
         *      The new operator is used to construct (create) an object
         *      We have to specify the class (Turtle) after the new operator
         *      We also have to specify any arguments (turtleWorld)
         *          used to construct the object
         *      A reference to the newly constructed object is returned by
         *          the new operator
         */
        Turtle turtle = new Turtle(turtleWorld);
        
        /* The setPenColor method takes one argument (the color)
         *  The setPenColor method is a mutator method.
         *      Mutator methods modify the state (properties) of the object
         *      
         *  The penDown and forward methods are also mutator methods.
         */
        turtle.setPenColor(Color.RED);
        
        // The penDown method takes no arguments
        turtle.penDown();
        turtle.forward(50);
        
        /* The penWidth method is an accessor method
         *  Accessor methods do not change the state of the object
         */
        int penWidth = turtle.getPenWidth():
        
        /* Variables store values.
         *  Variables have a type (int), a name (width), and a value (500)
         */
        int width = 500;
        
        /* There are several Java primitive data types
         *  Here are some examples:
         */
        // boolean stores true or false
        boolean isSummer = true;
        
        // int stores integer numbers
        int height = 400;
        
        // double stores real number (floating point)
        double scorePercentage = 0.85;
        
        // char stores a single character
        char letter = 'd';
        
    }
}





