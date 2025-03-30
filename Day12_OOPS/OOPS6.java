//Inheritence
public class OOPS6 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.body();
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Mammals extends Animal{
    void body(){
        System.out.println("body");
    }
}
class Fish extends Mammals{
    int fins;

    void swim(){
        System.out.println("Swim in the water");
    }
}
