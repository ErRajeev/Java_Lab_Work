interface A {
    void add();

    void div();
}

interface B {
    void mult();
}

// Interfaces arev Public and Abstract

class C implements A, B {
    public void add() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public void div() {
        int a = 20;
        int b = 5;
        System.out.println(a / b);
    }

    public void mult() {
        int a = 10;
        int b = 4;
        System.out.println(a * b);
    }

}

class MutipleInheritance {
    public static void main(String arg[]) {
        C obj = new C();
        obj.add();
        obj.div();
        obj.mult();
    }
}