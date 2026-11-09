package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).

// the Quarterback class: a blueprint for a player who throws passes to receivers
public class Quarterback {
    // quarterback's name
    private String name;
    // the longest pass he can throw, in yards
    private int armStrength;
    // how many passes he has thrown (caught or not)
    private int attempts;
    // how many of those passes were caught
    private int completions;
    // total yards of the caught passes
    private int passingYards;

    // constructor: sets up the name and arm strength when we do new Quarterback(...)
    public Quarterback(String name, int armStrength) {
        // copy the parameter into the field (this. = the field)
        this.name = name;
        // same for arm strength
        this.armStrength = armStrength;
    }

    // getter for the name
    public String getName() {
        // hand back the name
        return name;
    }

    // getter for attempts
    public int getAttempts() {
        // hand back the attempts
        return attempts;
    }

    // getter for completions
    public int getCompletions() {
        // hand back the completions
        return completions;
    }

    // getter for passing yards
    public int getPassingYards() {
        // hand back the passing yards
        return passingYards;
    }

    // throws a pass to a receiver; returns true if caught, false if not
    public boolean throwTo(Receiver target, int yards) {
        // every throw counts as an attempt, even if it's incomplete
        attempts += 1;
        // if the pass is longer than his arm can throw, it falls short
        if (yards > armStrength) {
            // print the incomplete pass; target.getName() asks the receiver for his name
            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: INCOMPLETE");
            // report that it was not caught and stop the method here
            return false;
        }
        // we got past the if, so the pass was caught: one more completion
        completions += 1;
        // add the pass's yards to his total
        passingYards += yards;
        // tell the receiver he caught it, so HIS catches and yards go up
        target.catchBall(yards);
        // print the caught pass
        System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: CAUGHT");
        // report that it was caught
        return true;
    }

    // overloading: same name as above but only a receiver; this is a short 10 yard pass
    public boolean throwTo(Receiver target) {
        // reuse the other throwTo with 10 so the arm check is only written once
        return throwTo(target, 10);
    }

    // gives the completion percent as a whole number
    public int completionPercentage() {
        // if he hasn't thrown yet, avoid dividing by zero
        if (attempts == 0) {
            // no throws means 0%
            return 0;
        }
        // multiply by 100 FIRST, then divide, or integer division gives 0 (2/3 = 0)
        return completions * 100 / attempts;
    }

    // toString: what gets printed when we print a Quarterback
    public String toString() {
        // builds text like "Carter: 2/3, 40 yards, 66%"
        return name + ": " + completions + "/" + attempts + ", " + passingYards + " yards, " + completionPercentage() + "%";
    }
}
