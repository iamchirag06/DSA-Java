public class OOPS10 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eat();
        
    }
}

interface ChessPlayer{ 
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){ //interfaces are set to be deafult so we use public
        System.out.println("Queen");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King");
    }
}

// homework
interface Herbivore{
    void eat();
}
interface Carnivore{
    void eat();
}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Grass and  Flesh");
    }
}

    
