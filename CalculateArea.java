import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateArea {

    Scanner scanner;
    private Rectangle rectangle;
    private Circle circle;
    private int choice;
    private boolean isRunning = true;

    public CalculateArea () {
        scanner = new Scanner(System.in);
        rectangle = new Rectangle();
        circle = new Circle();
    }
    public void calculateMenu() {
        while (isRunning) {
        try {
        System.out.println("\nWelcome to the calculator");
        System.out.println("Press 1 to calculate area of a rectangle");
        System.out.println("Press 2 to calculate area of a circle");
        System.out.println("Press 3 to exit");
        System.out.print("\nChoose: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
            rectangle.rectangleMenu();
            break;
            case 2:
            circle.circleMenu();
            break;
            case 3:
            System.out.println("\nExit program.");
            isRunning = false;
            break;
            default:
            System.out.println("\nInvalid entry. Try again.");
            break;
        }
        }
        catch (InputMismatchException e){
            System.out.println("\nInvalid entry. Try again.");
            scanner.next();
        }
        }    
    }
}
