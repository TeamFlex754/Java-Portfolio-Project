import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creates a new object of carInventory
        CarInventory inventory = new CarInventory();
        Scanner scanner = new Scanner(System.in);

        // Boolean to control while loop
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new car");
            System.out.println("2. Display all cars");
            System.out.println("3. Remove a car");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character

            // Switch to provide options based on user command
            switch (choice) {
                case 1:
                    inventory.addNewCar(); // Call the method to add a new car
                    break;
                case 2:
                    inventory.displayCars(); // Call the method to display all cars
                    break;
                case 3:
                    inventory.removeCar(); // Call the method to remove a car
                    break;
                case 4:
                    running = false; // Exit the loop
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close the scanner
    }
}