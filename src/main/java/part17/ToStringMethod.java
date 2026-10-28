package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.

// publicly accessed class called ToStringMethod
public class ToStringMethod {
    // where the program  begins
    public static void main(String[] args) {

        // Instantiates a new Car object using the car constructor
        Car car = new Car();

        // Prints the value of the make field from the car object to the console
        System.out.println(car.make);
        // Prints the value of the model field from the car object to the console
        System.out.println(car.model);
        // Prints the value of the color field from the car object to the console
        System.out.println(car.color);
        // Prints the value of the year field from the car object to the console
        System.out.println(car.year);

        // Explicitly calls the overridden toString method on the car object and prints its string representation
        System.out.println(car.toString());
        // Implicitly invokes the toString method on the car object when passed directly to println
        System.out.println(car);
    }

}
