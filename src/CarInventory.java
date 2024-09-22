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

    public void displayCars() {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            car.displayCarDetails();
        }
    }
}