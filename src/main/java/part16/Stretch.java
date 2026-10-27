package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        rewatch 3:10:07–3:19:32 for constructors and "this",
//        3:19:50–3:25:04 for local and global variables
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra classes (Counter, Pet, Broken) go in THIS file,
// BELOW the last } of class Stretch, without the word public.

public class Stretch {
    public static void main(String[] args) {
        /*My Guess:
        3
        10
        3
        20
         */
        Counter c = new Counter();
        c.show();
        c.count = 20;
        c.show();

        // B1
        Pet pet1 = new Pet("Max", 3);
        Pet pet2 = new Pet("Luna", 5);
        pet1.speak();
        pet2.speak();

        // B2
        pet1.birthday();
        pet1.speak();

        // B3
        Broken broken = new Broken("Max", 3);
        System.out.println(broken.name + " " + broken.age);

    }
}

    class Broken {
        String name;
        int age;

        Broken(String name, int age) {
            // they are null and 0 at first because your just
            // assigning the name to itself instead of the name for every  object
            this.name = name;
            this.age = age;
        }
    }



    class Pet {
        String name;
        int age;

        Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void birthday() {
            age += 1;
            System.out.println("Happy birthday, " + this.name + "!");
        }

        void speak() {
            System.out.println(name + " is " + age + " years old");
        }
    }


    class Counter {
        int count = 10;

        void show() {
            int count = 3;
            System.out.println(count);
            System.out.println(this.count);
        }
    }
