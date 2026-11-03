package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.

// publicly accessed class ArrayOfObjects
public class ArrayOfObjects {
    // Declares the main method which serves as the entry point of the Java application
    public static void main(String[] args) {
        // Instantiates a new Food object representing pizza and assigns it to the food1 variable
        Food food1 = new Food("pizza");
        // Instantiates a new Food object representing a hamburger and assigns it to the food2 variable
        Food food2 = new Food("hamburger");
        // Instantiates a new Food object representing a hot dog and assigns it to the food3 variable
        Food food3 = new Food("hot dog");

        // Declares and initializes an array of Food objects named refrigerator containing food1, food2, and food3
        Food[] refrigerator = {food1, food2, food3};

        // Prints the name property of the first Food object stored at index 0 of the refrigerator array
        System.out.println(refrigerator[0].name);
        // Prints the name property of the second Food object stored at index 1 of the refrigerator array
        System.out.println(refrigerator[1].name);
        // Prints the name property of the third Food object stored at index 2 of the refrigerator array
        System.out.println(refrigerator[2].name);
    }
}
