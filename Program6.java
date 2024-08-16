//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6{
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         final double pi = 3.14159;
         System.out.println("Enter the radius");
         double radius = input.nextDouble();
         System.out.println("The Radius of the circle = " + radius);
         System.out.println("The Diameter of the circle = " + Math.round(1000 * radius * 2)/1000.0);
         System.out.println("The Area of the circle = " + Math.round(1000 * pi * radius * radius)/1000.0);
         System.out.println("The Circumference of the circle = " + Math.round(1000 * 2 * pi * radius)/1000.0);
    }
}
//Paste console output below:
/*
Enter the radius
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

*/
