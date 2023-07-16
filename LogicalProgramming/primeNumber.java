import java.util.Scanner;

class primeNumber {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number !!");
        int n = sc.nextInt();
        if (isPrime(n))
            System.out.println("Prime Number !!");
        else
            System.out.println("Not Prime Number !!");
        sc.close();
    }
}