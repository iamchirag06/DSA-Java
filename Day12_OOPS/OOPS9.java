public class OOPS9 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }
}

abstract class Animal {
    String color;

    Animal() { // Constructor
        color = "Brown";
        System.out.println("Animal called");
    }

    void eat() {
        System.out.println("Eats Anything");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse called");
    }

    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Wallk on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken called");
    }

    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("Walk on 2 legs");
    }
}
