package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13478s
//        (passing things to a method, then using them — same idea as park(car))
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part18/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Add up a, b and c — but a number only counts if the other two are different from it.
    //   uniqueSum(1, 2, 3)  → 6
    //   uniqueSum(3, 2, 3)  → 2     (both 3s are left out)
    //   uniqueSum(3, 3, 3)  → 0
    public static int uniqueSum(int a, int b, int c) {
        // ternary function
        int tempA = (a == b || a == c) ? 0:a;
        int tempB = (b == a || b == c) ? 0:b;
        int tempC = (c == b || c == a) ? 0:c;
        return tempA + tempB + tempC;   // YOUR CODE
    }

    // Add up a, b and c — but "teens" (13 to 19) count as 0, EXCEPT 15 and 16, which count.
    // Do NOT write the teen rule three times. Call fixTeen() on each number instead.
    //   sumWithoutTeens(1, 2, 3)     → 6
    //   sumWithoutTeens(2, 13, 1)    → 3
    //   sumWithoutTeens(15, 16, 17)  → 31
    public static int sumWithoutTeens(int a, int b, int c) {
        //take a b  and c and check if the numbers are in fixTeen before adding them
        int TempA = fixTeen(a);
        int TempB = fixTeen(b);
        int TempC =fixTeen(c);

        return TempA + TempB + TempC;   // YOUR CODE — use fixTeen
    }

    // The helper. Gives back 0 for 13, 14, 17, 18 and 19. Gives back n for everything else.
    //   fixTeen(13) → 0     fixTeen(15) → 15     fixTeen(20) → 20
    public static int fixTeen(int n) {
        // if the n is 13,14,17,18 and 19 return 0 but for everything else return n
        if (n == 13 ||n == 14 || n == 17 || n == 18 || n == 19){
            return 0;
        }
        return n;   // YOUR CODE
    }
}
