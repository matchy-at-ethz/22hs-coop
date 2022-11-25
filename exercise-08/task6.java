class Animal {}
class Mammal extends Animal {}
class Tiger extends Mammal {}
class Ship<T extends Animal> {
    public T content;
}

class Cage <T extends Mammal> {
    public T content;
    void takeFromShip(Ship<T> other) {
        this.content = other.content; // cast to (Mammal)
        other.content = null;
    }
}

class Zoo<T extends Mammal> {
    void swapTigers(Ship<T> mammalShip, Cage<Tiger> tigerCage) {
        Tiger tiger = tigerCage.content; // cast to (Tiger)
        Cage<Tiger> tmpCage = new Cage<Tiger>();
        tmpCage.takeFromShip((Ship<Tiger>) mammalShip); // supid cast to (Ship) (nothign inside the bracket)
        mammalShip.content = (T) tiger; // (Mammal)
        tigerCage.content = tmpCage.content; // statically we assigned tiger to tiger, this is okay; but even if we have the type erasure, they got erased to the same type (Mammal) so we are still assigning Mammal to Mammal and that's okay!
    }
}

public class task6 {
   public static void main(String[] args) {
       // write something here 
   } 
}
