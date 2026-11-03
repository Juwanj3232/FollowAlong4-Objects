package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13857s
//        rewatch from about 3:51:00 for static variables,
//        and from about 3:54:50 for static methods and Math.round
// Guide: GUIDE.md in this folder, steps 3–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B3 also adds to your Friend class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
    /* MY GUESS:
       4 - I thought it remembered the other friends we made in static keyword
       6
       you have 6 friends
       correction:
       0 - because the numberOfFriends is initialized as the default value for ints a 0
       2 - 3 friends are made gary and plankton
       you have 2 friends
    */
        System.out.println(Friend.numberOfFriends);
        Friend a = new Friend("Gary");
        Friend b = new Friend("Plankton");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

        // B1
        long rounded = Math.round(3.7);
        double root = Math.sqrt(81);
        int bigger = Math.max(4, 9);
        System.out.println(rounded + " " + root + " " + bigger);
        System.out.println();

        // B2
        System.out.println(Stretch.square(9));
        System.out.println(square(5));
        System.out.println();

        // B3
        Friend c = new Friend("Karen");
        System.out.println("Newest friend: " + Friend.newestFriend);
    }

    static int square(int n) {
        return n * n;
    }
}
