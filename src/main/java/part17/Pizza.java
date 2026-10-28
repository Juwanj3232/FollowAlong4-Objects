package part17;

// publicly accessed class called Pizza
public class Pizza {

    // Declares a string variable to store the type of bread for the pizza
    String bread;
    // Declares a string variable to store the type of sauce for the pizza
    String sauce;
    // Declares a string variable to store the type of cheese for the pizza
    String cheese;
    // Declares a string variable to store the topping for the pizza
    String topping;

    // Defines a constructor that accepts arguments for bread, sauce, cheese, and topping to initialize all fields
    Pizza(String bread, String sauce, String cheese, String topping) {
        // Assigns the passed bread parameter to the instance variable
        this.bread = bread;
        // Assigns the passed sauce parameter to the instance variable
        this.sauce = sauce;
        // Assigns the passed cheese parameter to the instance variable
        this.cheese = cheese;
        // Assigns the passed topping parameter to the instance variable
        this.topping = topping;
    }

    // Defines an overloaded constructor that accepts bread, sauce, and cheese, leaving topping unassigned
    Pizza(String bread, String sauce, String cheese) {
        // Assigns the passed bread parameter to the instance variable
        this.bread = bread;
        // Assigns the passed sauce parameter to the instance variable
        this.sauce = sauce;
        // Assigns the passed cheese parameter to the instance variable
        this.cheese = cheese;
    }

    // Defines an overloaded constructor that accepts bread and sauce, leaving other fields unassigned
    Pizza(String bread, String sauce) {
        // Assigns the passed bread parameter to the instance variable
        this.bread = bread;
        // Assigns the passed sauce parameter to the instance variable
        this.sauce = sauce;
    }

    // Defines an overloaded constructor that accepts only bread, leaving other fields unassigned
    Pizza(String bread) {
        // Assigns the passed bread parameter to the instance variable
        this.bread = bread;
    }

    // Defines a no-argument constructor that creates a Pizza object with default uninitialized fields
    Pizza() {

    }

    public String toString() {
        // Concatenates the cheese, bread, sauce and topping  separated by newline characters and returns the result
        return bread + "\n" + sauce + "\n" + cheese + "\n" + topping;
    }
}
