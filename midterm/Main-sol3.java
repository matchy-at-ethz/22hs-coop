public class Main {
    
    public static void main(String[] args) {
        A i = new B();
        callM(i);
    }

    public static void callM (I1 i1) {
        String x = "1";
        i1.m(x);
    }

    public static void callM (I2 i2) {
        String y = "2";
        i2.m(y);
    }
}

interface I1 {
    public void m (String i1);
}

interface I2 extends I1 {
    public void m (String i2);
}

class A implements I1, I2 {
    public void m (String a) {
        System.out.println("AS" + a);
    }
}

class B extends A {
    public void m (Object b) {
        System.out.println("BO" + b);
    } 
}
