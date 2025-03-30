// Method overriding (RUN TIME POLYMORPHISM)
public class OOPS7a {
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
        Animal a = new Animal();
        a.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
