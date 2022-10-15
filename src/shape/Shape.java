package shape;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Shape {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        
        Rectangle r = new Rectangle(s.nextInt(), s.nextInt()); 
        System.out.println("Area of Rectangle = " + r.getArea()); 
        
       Rectangle p = new Rectangle(s.nextInt(), s.nextInt()); 
        System.out.println("Area of Perimeter = " + p.getPerimeter());
       
    }
    
}
