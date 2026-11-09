package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).

// the Receiver class: a blueprint for one receiver 
public class Receiver{
    // the receiver's name: private so only this class can change it
    private String name;
    // jersey number
    private int number;
    // how many passes he has caught so far (starts at 0 on its own)
    private int catches;
    // total yards from all his catches (starts at 0 on its own)
    private int yards;

    // constructor: runs when we do new Receiver(...) and sets up the name and number
    public Receiver(String name, int number){
        // this.name is the field, name is the parameter; copy the parameter into the field
        this.name = name;
        // same thing for the jersey number
        this.number = number;
    }

    // getter: lets other classes read the name 
    public String getName(){
       // hand back the name
       return name;
    }

    // getter for the jersey number
    public int getNumber(){
        // hand back the number
        return number;
    }

    // getter for how many catches he has
    public int getCatches(){
        // hand back the catches
        return catches;
    }

    // getter for his total yards
    public int getYards(){
        // hand back the yards
        return yards;
    }

    // called when he catches a pass; gain = how many yards the pass was
    public void catchBall(int gain){
        // one more catch
        catches += 1;
        // add this pass's yards to his total
        yards += gain;
    }

    // average yards per catch, as a double so we keep the decimals (12.5, not 12)
    public double yardsPerCatch(){
        // no catches yet: dividing by 0 is a problem, so just give back 0.0
        if (catches == 0){
            // average of nothing is 0.0
            return 0.0;
        }
        // (double) turns yards into a double BEFORE dividing, so it's not integer division
        return (double) yards / catches;
    }

    // toString: what gets printed when we print a Receiver object
    public String toString(){
        // exactly 1 catch: use the singular word "catch"
        if (catches == 1){
            // builds text like "#84 Brooks: 1 catch, 25 yards"
            return "#" + number + " " + name + ": " + catches + " catch, " + yards + " yards";
        }
        // any other number of catches: builds text like "#11 Davis: 2 catches, 20 yards"
        return "#" + number + " " + name + ": " + catches + " catches, " + yards + " yards";
    }

}
