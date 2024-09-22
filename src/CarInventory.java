import java.util.ArrayList;
import java.util.Scanner;

public class CarInventory {

    private ArrayList<Car> cars = new ArrayList<>();  // ArrayList of car inventory


    public void addNewVehicle() {  // Method to add a new vehicle
        Scanner scanner = new Scanner(System.in);
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


            Car newCar = new Car(make, model, color, year, mileage);
            cars.add(newCar);
            System.out.println("Car add successfully!");

        } catch (Exception e) {
            System.out.println("Error adding car: " + e.getMessage());
        }
    }
    public void removeVehicle() {
        Scanner scanner = new Scanner(System.in);
        if (cars.isEmpty()) {
            System.out.println("No cars available to remove.");
            return;
        }

        // Display the cars with their index so user can select one
        System.out.println("Select the car to remove by its index:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + ": " + cars.get(i).getMake() + " " + cars.get(i).getModel());
        }

        try {
            System.out.println("Enter the index of the car you want to remove: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < cars.size()) {
                cars.remove(index);
                System.out.println("Car removed successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        } catch (Exception e) {
            System.out.println("Error removing car: " + e.getMessage());
        }
    }
    public void displayCars() {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            car.displayCarDetails();
        }
    }
}


