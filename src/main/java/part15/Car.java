package part15;
// publicly accessed class called Car
public class Car {
    // Defines a String attribute for the car's manufacturer and initializes it to "Chevrolet"
    String make = "Chevrolet";
    // Defines a String attribute for the car's specific model name and initializes it to "Corvette"
    String model = "Corvette";
    // Defines an integer attribute for the vehicle's manufacturing year and sets it to 2020
    int year = 2020;
    // Defines a String attribute representing the exterior color of the vehicle as "blue"
    String color = "blue";
    // Defines a double precision floating-point attribute for the price and sets it to 50000.00
    double price = 50000.00;

    // Declares a method named drive that contains behavior logic when the car is driven
    void drive() {
        // Prints a status message to the console indicating that someone is driving the car
        System.out.println("You drive the car");
    }

    // Declares a method named brake that contains behavior logic when stopping the car
    void brake() {
        // Prints a status message to the console indicating that the brakes are being applied
        System.out.println("You step on the brakes");
    }
}
