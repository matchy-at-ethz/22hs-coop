public class test {
    public static void main (String[] args) {
        A i = new A();
        callM(i);
    }

    static void callM(I1 i) {
        String x = "1";
        i.m(x);
    }

    static void callM(I2 i) {
        String y = "2";
        i.m(y);
    }

    static void callM(I3 i) {
        String z = "3";
        i.m(z);
    }
}

interface I1 {
    public void m(String x);
}

interface I2 extends I1 {
    default public void m (String x) {
        System.out.println("IS" + x);
    }
}

interface I3 extends I2 {}

class A implements I2, I1, I3 {
    public void m(String x) {
        System.out.println("AS" + x);
    }
}
