package part18;
// publicly accessed class Food
public class Food {
    // Declares a String instance variable to hold the name of the food item
    String name;

    // Defines a constructor for the Food class that accepts a String argument to initialize the name field
    Food(String name) {
        // Assigns the passed parameter value to the current object's name instance variable using 'this'
        this.name = name;
    }
}