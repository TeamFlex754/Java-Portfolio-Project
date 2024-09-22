public class Car {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Constructor
    public Car(String make, String model, String color, int year, int mileage) {  // Constructor of car class
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}
//parameterized constructor
//add new vehicle method
//remove vehicle method
//update vehicle attributes method

//all methods needs try/ catch constructs with success or failure messages

    /*
Create an additional class to call your automobile class (e.g., Main or AutomobileInventory). Include a try..catch construct and print it to the console.

Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").
    Then call the method to list the values. Loop through the array and print to the screen.

Call the remove vehicle method to clear the variables.
    Print the return value.
Add a new vehicle.
    Print the return value.
    Call the list method and print the new vehicle information to the screen.
Update the vehicle.
    Print the return value.
    Call the listing method and print the information to the screen.
Display a message asking if the user wants to print the information to a file (Y or N).
    Use a scanner to capture the response. If "Y", print the file to a predefined location (e.g., C:\Temp\Autos.txt).
    Note: you may want to create a method to print the information in the main class.
    If "N", indicate that a file will not be printed.
*/
