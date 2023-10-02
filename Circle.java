// Class to calculate area of a circle.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Circle {

    Scanner scanner = new Scanner(System.in);
    public final double pi = Math.PI;
    double radius = 0;

    public Circle() {
        
    }
    
    public void circleMenu() {
        try {
        radius = 0;
        System.out.print("Please enter the radius of the circle: ");
        radius = scanner.nextDouble();
        System.out.println("\nThe radius of the circle is " + radius);
        System.out.println("Considering the radius, the area of the circle is: " + calculateTheArea(radius));
    }
    catch (InputMismatchException e) {
        System.out.println("\nInvalid entry. Try again.");
        scanner.nextLine();
        circleMenu();
    }
    }
    // Calculating the area of the circle, based on the radius squared.
    public double calculateTheArea(double radius) {
        return pi * Math.pow(radius, 2);
    }

}
