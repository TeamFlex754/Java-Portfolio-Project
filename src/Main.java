import java.io.FileWriter;
import java.io.IOException;
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

                    // Ask if user wants to print cars to file
                    System.out.println("Do you want to print the car information to a file? (Y/N): ");
                    String response = scanner.nextLine().toUpperCase();

                    if (response.equals("Y")) {
                        // Directly writing the contents of the cars list to a file
                        try (FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt")) {
                            for (Car car : inventory.getCars()) { // Assuming cars is public or accessible
                                writer.write(car.toString() + "\n"); // Assuming Car has a toString() method
                            }
                            System.out.println("File has been written to: C:\\Temp\\Autos.txt");
                        } catch (IOException e) {
                            System.out.println("Error writing to file: " + e.getMessage());
                        }
                    } else if (response.equals("N")) {
                        System.out.println("No file will be printed.");
                    } else {
                        System.out.println("Invalid input. Please enter Y or N.");
                    }
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