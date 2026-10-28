package part17;

// publicly accessed class called Car
public class Car {
    // Declares and initializes a string variable representing the car's manufacturer
    String make = "Ford";
    // Declares and initializes a string variable representing the car's model name
    String model = "Mustang";
    // Declares and initializes a string variable representing the car's exterior color
    String color = "red";
    // Declares and initializes an integer variable representing the car's manufacturing year
    int year = 2021;

    // Overrides the default toString method to return a custom multi-line formatted string of the car's attributes
    public String toString() {
        // Concatenates the make, model, color, and year separated by newline characters and returns the result
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

}
