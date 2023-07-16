import java.util.Scanner;

class Pelindrome {
    int n;

    void Pelind() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number !!");
        n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev)
            System.out.println("Pelindrome");
        else
            System.out.println("Not Pelindrom");
        sc.close();
    }
}

class Fibonacci {
    static void fib() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Fibonacci");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        sc.close();
    }
}

class Prime {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}

class Exp1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Prime\n2 : Fibonacci\n3 : Pelindrome");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter a Number !!");
                int n = sc.nextInt();
                System.out.println(Prime.isPrime(n));
                break;
            case 2:
                Fibonacci.fib();
                break;
            case 3:
                Pelindrome obj = new Pelindrome();
                obj.Pelind();
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
        sc.close();
    }
}