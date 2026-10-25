package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.
// publicly accessed class called ObjectOriented
    public class ObjectOriented {
        // Declares the main method which serves as the entry point of the program execution
        public static void main(String[] args) {
            // Creates a new instance of the Car object named myCar1 using the default constructor
            Car myCar1 = new Car();
            // Creates a second distinct instance of the Car object named myCar2
            Car myCar2 = new Car();
            // Accesses and prints the make attribute (Chevrolet) belonging to the first car object
            System.out.println(myCar1.make);
            // Accesses and prints the model attribute (Corvette) belonging to the first car object
            System.out.println(myCar1.model);
            // Prints a blank line to the console for visual spacing between outputs
            System.out.println();
            // Accesses and prints the make attribute belonging to the second car object
            System.out.println(myCar2.make);
            // Accesses and prints the model attribute belonging to the second car object
            System.out.println(myCar2.model);
            // Invokes the drive behavior method defined inside the Car class for myCar1
            myCar1.drive();
            // Invokes the brake behavior method defined inside the Car class for myCar1
            myCar1.brake();


        }
    }

