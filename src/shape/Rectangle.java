package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
       int result=length*breadth;
        return result; // write code to calculate area here
    } 
    
    // write code to calculate perimeter here
    // getPerimeter()
    
}