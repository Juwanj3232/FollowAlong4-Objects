package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
// Look back at: part 18 (passing objects), part 17 (toString), part 02 (int vs double).
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Receiver class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
       /* MY GUESS:
           Carter -> Davis, 15 yards: CAUGHT
           Carter -> Davis, 10 yards: CAUGHT
           #11 Davis: 1 catches, 15 yards
           (I thought slot was a separate receiver, so Davis would only get the first pass.
           CHECK THIS and edit it to your real guess, then note why you were wrong.)
        */

        // WHY I WAS WRONG: slot = davis does not make a new Receiver. There is only one
        // "new Receiver", so slot and davis are two names for the same object.

        Quarterback carter = new Quarterback("Carter", 40);
        Receiver davis = new Receiver("Davis", 11);
        Receiver slot = davis;
        carter.throwTo(davis, 15);
        carter.throwTo(slot, 10);
        System.out.println(davis);

        // B1
        int completions = 2;
        int attempts = 3;

        // 2 / 3 is int division = 0 (decimals are cut off), and 0 * 100 is still 0
        System.out.println(completions / attempts * 100);
        // multiply first: 200 / 3 = 66 (still int division, but now the number is bigger)
        System.out.println(completions * 100 / attempts);
        // 100.0 is a double, so the math is done with decimals: 66.66666666666667
        System.out.println(completions * 100.0 / attempts);

        // B2

        // 25 yards on 2 catches = 12.5
        System.out.println(davis.yardsPerCatch());
        // a new receiver with 0 catches, so it gives back 0.0 instead of dividing by zero
        Receiver rookie = new Receiver("Lee", 3);
        System.out.println(rookie.yardsPerCatch());

        // B3

        Receiver brooks = new Receiver("Brooks", 84);
        brooks.catchBall(25);

        // 1 catch, so it says "1 catch"
        System.out.println(brooks);
        brooks.catchBall(5);
        // 2 catches, so it says "2 catches"
        System.out.println(brooks);
    }
}
