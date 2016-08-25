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
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
    }
}




