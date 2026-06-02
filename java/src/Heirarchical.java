class A {
    void A() {
        System.out.println("In A");
    }
}

class B extends A {
    void B() {
        System.out.println("In B");
    }
}

class C extends B {
    void C() {
        System.out.println("In C");
    }
}

class C1 extends C {
    void C1() {
        System.out.println("In C1");
    }
}

class C2 extends C {
    void C2() {
        System.out.println("In C2");
    }
}

public class Heirarchical {
    public static void main(String[] args) {
        C1 c1 = new C1();

        c1.A();
        c1.C1();
    }
}
