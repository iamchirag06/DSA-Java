
//Getter ans setter 
public class OOPS3 {

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setTip(5);
        p1.setColor("WHITE");

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    String setColor(String newColor){
        color = newColor;
        return null;
    }

    int setTip(int newtip) {
        tip = newtip;
        return 0;
    }

}
