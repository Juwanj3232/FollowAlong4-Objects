package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

// Begins the definition of the public class named StaticKeyword
public class StaticKeyword {

    // the entry point where Java program execution begins
    public static void main(String[] args) {

        // Prints the current static count of friends (0 so far) to the console by accessing the Friend class variable directly
        System.out.println(Friend.numberOfFriends);

        // Creates a new Friend object named friend1 with the name "SpongeBob", which increments the static friend count
        Friend friend1 = new Friend("SpongeBob");

        // Creates a new Friend object named friend2 with the name "Patrick", which increments the static friend count again
        Friend friend2 = new Friend("Patrick");

        // Creates a new Friend object named friend3 with the name "Squidward", incrementing the friend count a third time
        Friend friend3 = new Friend("Squidward");

        // Calls the static displayFriends method from the Friend class to print the current total count (3)
        Friend.displayFriends();

        // Creates a new Friend object named friend4 with the name "Sandy", incrementing the static friend count to 4
        Friend friend4 = new Friend("Sandy");

        // Calls the static displayFriends method again to print the updated total count (4)
        Friend.displayFriends();

        // Demonstrates a built-in Java static method by rounding the decimal number 3.14 to the nearest whole number (3) and printing it
        System.out.println(Math.round(3.14));

    }

}