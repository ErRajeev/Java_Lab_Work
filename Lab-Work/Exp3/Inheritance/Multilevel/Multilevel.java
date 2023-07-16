import java.util.Scanner;
class Cal1 {
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number For Addithon");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public void mult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number For Mult");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}

class Cal2 extends Cal1 {
    public void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number For Division");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}

class AdvCal extends Cal2 {
    public void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number For Mod");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        System.out.println("OutPut");
        AdvCal obj = new AdvCal();
        obj.add();
        obj.mult();
        obj.div();
        obj.mod();
    }
}
