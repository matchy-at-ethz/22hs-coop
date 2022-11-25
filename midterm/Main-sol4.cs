using System;

public class main {
    public static void Main(String[] args) {
        A i = new B();
        callM((I2)i);
    }

    static void callM (I1 i1) {
        String x = "1";
        i1.m(x);
    }

    static void callM (I2 i2) {
        String y = "2";
        (i2 as dynamic).m(y);
    }
}

interface I1 {
    void m (String i1);
}

interface I2 {
    void m (String i2);
}

class A : I1, I2 {
    public void m (String a) {
        System.Console.WriteLine("AS" + a);
    }
}

class B : A {
    public void m (Object b) {
        System.Console.WriteLine("BO" + b);
    }
}
