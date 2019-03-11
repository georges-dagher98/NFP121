package question1;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class main
     */
     public static void main(String[]args){
         Circle circle=new Circle();
         Triangle triangle=new Triangle();
          Square square=new Square();
        circle.makeVisible();
        circle.slowMoveHorizontal(1);
        triangle.makeVisible();
        triangle.slowMoveVertical(2);
        square.makeVisible();
        square.moveRight();
        square.changeSize(23);
       
    }
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
