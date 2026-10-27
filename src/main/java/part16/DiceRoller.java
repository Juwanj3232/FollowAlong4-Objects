package part16;
import java.util.Random;
// importing the random class to use its libraries

// publicly accessed class DiceRoller
public class DiceRoller {
    // random object of the Random class making a new object
    Random random = new Random();
    // int named number
    int number;

    // Constructor for the DiceRoller to be used in main
    DiceRoller() {
        // making a new random object
        random = new Random();
        // using the roll method below which hands back a number from 1-6
        roll();
    }

    // roll method that hands back nothing
    void roll() {
        // assigning the random number to number
        number = random.nextInt(6) + 1;
        // prints out the random numer from 6 - 1
        System.out.println(number);
    }
}
