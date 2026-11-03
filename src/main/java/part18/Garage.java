package part18;
// publicly accessed class Garage
public class Garage {

    // Defines a method named park that accepts a Car object as a parameter and returns nothing (void)
    void park(Car car) {
        // Prints a message to the console incorporating the name property from the passed Car object
        System.out.println("The " + car.name + " is parked in the garage");
    }

    void leave(Car car){
        System.out.println("The " + car.name + " left the garage");
    }
}
