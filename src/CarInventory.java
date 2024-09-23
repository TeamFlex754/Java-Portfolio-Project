import java.util.ArrayList;
import java.util.Scanner;

public class CarInventory {

    // ArrayList of Car objects
    private ArrayList<Car> cars = new ArrayList<>();

    // Method to add a new car
    public void addNewCar() {
        Scanner scanner = new Scanner(System.in);

        // Try catch
        try {
            System.out.println("Enter the car make: ");
            String make = scanner.nextLine();

            System.out.println("Enter the car model: ");
            String model = scanner.nextLine();

            System.out.println("Enter the car color: ");
            String color = scanner.nextLine();

            System.out.println("Enter the car year: ");
            int year = scanner.nextInt();

            System.out.println("Enter the car mileage: ");
            int mileage = scanner.nextInt();

            // Car object created "newCar"
            Car newCar = new Car(make, model, color, year, mileage);

            // Adds "newCar" to ArrayList
            cars.add(newCar);
            System.out.println("Car added successfully.\n");

        } catch (Exception e) {
            System.out.println("Error adding car: " + e.getMessage() + "\n");
        }
    }
    // Method to remove a car
    public void removeCar() {
        Scanner scanner = new Scanner(System.in);

        // If block to verify if cars inventory is empty
        if (cars.isEmpty()) {
            System.out.println("No cars available to remove.\n");
            return;
        }

        // Display the cars with their index so user can select one
        System.out.println("\nSelect the car to remove by its index:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + ": " + cars.get(i).getMake() + " " + cars.get(i).getModel());
        }

        // Try catch
        try {
            System.out.println("\nEnter the index of the car you want to remove: ");
            // Adds the user integer input to a variable "index"
            int index = scanner.nextInt();

            if (index >= 0 && index < cars.size()) {
                cars.remove(index);
                System.out.println("Car removed successfully.\n");
            } else {
                System.out.println("Invalid index.\n");
            }
        // Catches all exceptions and prints the message
        } catch (Exception e) {
            System.out.println("Error removing car: " + e.getMessage() + "\n");
        }
    }

    // Displays the cars using the displayCarDetails method from the Car class
    public void displayCars() {
        for (Car car : cars) {
            car.displayCarDetails();
        }
    }
}


