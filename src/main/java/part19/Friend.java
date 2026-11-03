package part19;

// Begins the definition of the public class named Friend
public class Friend {

    // Declares an instance variable 'name' to store the individual name of each Friend object
    String name;

    // Declares a static variable 'numberOfFriends' shared across all instances to keep a running total count of created Friend objects
    static int numberOfFriends;

    // Defines the constructor method for the Friend class that runs whenever a new Friend is instantiated with a name string
    Friend(String name){

        // Assigns the passed constructor parameter 'name' to the current object's instance variable using the 'this' keyword
        this.name = name;

        // Increments the shared static 'numberOfFriends' counter by 1 every time a new friend object is successfully created
        numberOfFriends++;

    }

    // Defines a static method 'displayFriends' that can be called on the class itself without needing an individual object instance
    static void displayFriends() {

        // Prints a message to the console combining static text with the current shared value of 'numberOfFriends'
        System.out.println("You have " + numberOfFriends + " friends");

    }
}
