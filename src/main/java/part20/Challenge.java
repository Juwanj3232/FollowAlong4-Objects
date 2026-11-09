package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part20/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // A lottery ticket has three numbers.
    //   all three the same                          → 10
    //   b and c are BOTH different from a           → 5
    //   anything else                               → 0
    //   ticketResult(2, 2, 2) → 10     ticketResult(1, 2, 3) → 5     ticketResult(2, 2, 1) → 0
    public static int ticketResult(int a, int b, int c) {
        if (a == b && a == c){
            return 10;
        }
        else if (a != b && a!= c){
            return 5;
        }
        return 0;   // YOUR CODE
    }

    // true if x and y show up the same number of times inside s.
    //   sameCount("catdog", "cat", "dog")   → true    (once each)
    //   sameCount("catcat", "cat", "dog")   → false   (twice and zero times)
    //   sameCount("", "cat", "dog")         → true    (zero each)
    public static boolean sameCount(String s, String x, String y) {
        return count(s, x) == count(s, y);   // YOUR CODE
    }

    // helper
    private static int count(String s, String word) {
        int total = 0;
        int start = 0;
        // indexOf gives -1 when there are no more matches
        while ((s.indexOf(word, start)) != -1) {
            total++;
            // jump past this match so we look for the next one
            start = s.indexOf(word, start) + word.length();
        }
        return total;
    }
}
