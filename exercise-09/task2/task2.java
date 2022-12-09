package A;

public abstract class Person {
    protected int tickets = 0; // used in multiple packages
    default final int maxTickets = 3;

    default abstract void buy(int t);
}

public class Buyer extends Person {
    private void inc(int t) {
        if (this.tickets + t <= this.maxTickets) this.tickets += t;
    }
    public void buy(int t) { if (t >= 0) inc(t); }
}

package B;
import A.*;

public class SmartBuyer extends Buyer {
    private void inc(int t) { this.tickets += t; }
}

public class task2 {
    public static void main(String args[]) {
        Buyer b = new SmartBuyer();
        b.buy(9); // used here in main, not a friend or subclass of Buyer or Person
    }
}
