package part16;

// Defines the public class named Human that can be accessed across other classes
public class Human {
    // Declares a String field to store the human's name
    String name;
    // Declares an integer field to store the human's age
    int age;
    // Declares a double to store the human's weight
    double weight;

    // Constructor method used to initialize a new Human object with a name, age, and weight
    Human(String name, int age, double weight) {
        // Assigns the value of the local name parameter to this object's name field
        this.name = name;
        // Assigns the value of the local age parameter to this object's age field
        this.age = age;
        // Assigns the value of the local weight parameter to this object's weight field
        this.weight = weight;
    }

    // Defines an instance method that prints a message indicating this human is eating
    void eat() {
        // Outputs the human's name followed by a text string stating they are eating
        System.out.println(this.name + " is eating");
    }

    // Defines an instance method that prints a message indicating this human is drinking with a burp sound
    void drink() {
        // Outputs the human's name followed by a text string stating they are drinking and burping
        System.out.println(this.name + " is drinking *burp*");
    }

}
