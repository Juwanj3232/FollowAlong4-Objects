package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        starts at about 3:25:40 — stop at about 3:32:05, before "the toString method"
// Guide: GUIDE.md in this folder, steps 1–7
//
// Part 17, topic 1 — overloaded constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedConstructors.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Pizza. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Pizza.java too.

// publicly accessed class called OverloadedConstructors
public class OverloadedConstructors {
    // Declares the main execution method where program execution begins
    public static void main(String[] args) {

        // Instantiates a new Pizza object using an overloaded constructor with three string arguments
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella");

        // Prints an introductory message to the console
        System.out.println("Here are the ingredients of your pizza: ");
        // Prints the bread property of the pizza object to the console
        System.out.println(pizza.bread);
        // Prints the sauce property of the pizza object to the console
        System.out.println(pizza.sauce);
        // Prints the cheese property of the pizza object to the console
        System.out.println(pizza.cheese);
        // Prints the topping property of the pizza object (which is null) to the console
        System.out.println(pizza.topping);
    }

}
