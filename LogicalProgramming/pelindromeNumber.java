import java.util.Scanner;

class pelindromeNumber {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number !!");
        int n = sc.nextInt();
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