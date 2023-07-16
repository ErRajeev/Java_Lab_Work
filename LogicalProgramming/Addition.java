import java.util.Scanner;

public class Addition {
    public static void main(String arg[]) {
        Sum ob = new Sum();
        ob.get();
        ob.cal();
        ob.dis();
    }
}

class Sum {
    int x, y, z;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        x = sc.nextInt();
        System.out.print("Enter Second Number : ");
        y = sc.nextInt();
        sc.close();
    }

    void cal() {
        z = x + y;
    }

    void dis() {
        System.out.println("Summition is " + z);
    }
}