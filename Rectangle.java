import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {

    private int width;
    private int length;
    private int rectangleArea;
    Scanner scanner = new Scanner(System.in);

    public Rectangle() {

    }
    public void rectangleMenu() {
        try {
        System.out.println("Please enter the width and the length to calculate area of a rectangle");
        System.out.print("Width: ");
        width = scanner.nextInt();
        System.out.print("Length: ");
        length = scanner.nextInt(); 
        rectangleArea = width * length;
        System.out.println("\nThe area for the rectangle is: " + rectangleArea);
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid entry. Try again.");
            scanner.nextLine();
            rectangleMenu();
        }
    }
}
