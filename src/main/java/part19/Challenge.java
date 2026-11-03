package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        (these are static methods — you call them with the class name, like Math.round)
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part19/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Round each number to the nearest 10, then add them up. Use round10() for each one.
    //   roundedTotal(16, 17, 18)  → 60    (20 + 20 + 20)
    //   roundedTotal(12, 13, 14)  → 30    (10 + 10 + 10)
    public static int roundedTotal(int a, int b, int c) {
        //round each parameter then add the rounded value to return it
        // use round 10
        return round10(a) + round10(b) + round10(c) ;
    }

    // The helper. Rounds n to the nearest 10. A last digit of 5 or more rounds UP.
    //   round10(15) → 20     round10(14) → 10     round10(20) → 20
    public static int round10(int n) {
        int lastDigit = n % 10;
        // ternary: if the lastdigit is larger or equal to 5
        // if its true the n is added to the rounded down version
        // if false take away last digit
        return lastDigit >= 5 ? n + (10 - lastDigit) : n - lastDigit;
    }

    // Small bricks are 1 inch long. Big bricks are 5 inches long.
    // Can you make a row EXACTLY goal inches long with the bricks you have?
    //   canBuildWall(3, 1, 8)  → true    (one big + three small)
    //   canBuildWall(3, 1, 9)  → false   (one inch short)
    //   canBuildWall(3, 2, 10) → true    (two big)
    // No loop needed — and with huge numbers a loop is too slow anyway.
    public static boolean canBuildWall(int small, int big, int goal) {
        // small = 1 in | big = 5 in
        // convert how many is  big to inches and
        int conversionBig =  big * 5;
        // compare against goal to see if I have enough and if not return false
        if (small + conversionBig < goal){
            return false;
        }
        // bricks we can use without going over the goal
        int maxBigBrick = goal / 5;

        // as many big bricks we can use before using small ones
        int bigBricksUsed = Math.min(big,maxBigBrick);

        // find how many small bricks to use
        int remainingBricks = goal - (bigBricksUsed * 5);
        // answer to whether we have enough small bricks
        return small >= remainingBricks;
    }
}
