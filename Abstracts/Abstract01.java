import java.util.Scanner;

abstract class A {
    abstract public void get();
}

class Abstract01 extends A {

    Abstract01() {
    }

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y);
        sc.close();
    }

    public static void main(String arg[]) {
        Abstract01 obj = new Abstract01();
        obj.get();
    }
}
