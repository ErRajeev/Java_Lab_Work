import java.util.Scanner;

class Armstrong {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int summ = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            summ = summ + (rem * rem * rem);
            n = n / 10;
        }
        if (summ == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
        sc.close();
    }
}