import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarInventory inventory = new CarInventory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new vehicle");
            System.out.println("2. Display all vehicles");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    inventory.addNewVehicle(); // Call the method to add a new vehicle
                    break;
                case 2:
                    inventory.displayCars(); // Call the method to display all vehicles
                    break;
                case 3:
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