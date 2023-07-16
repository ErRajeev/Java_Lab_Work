import java.util.Scanner;

class ExceptionsHandling {
    private Scanner sc = new Scanner(System.in);

    public void performArithmetic() {
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Division: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }

    public void handleArrayIndex() {
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        try {
            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println("The value of arr[4] is: " + arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: " + e);
            handleStringIndex();
        }
    }

    public void handleStringIndex() {
        try {
            System.out.println("Enter the string:");
            sc.nextLine();
            String str = sc.nextLine();
            try {
                String s = "Rajeev";
                System.out.println("String length: " + s.length());
                try {
                    String s1 = "Hello";
                    char c = s1.charAt(10);
                    System.out.println(c);
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("You are trying to access out of bounds: " + e);
                    e.printStackTrace();
                }
            } catch (NullPointerException e) {
                System.out.println("String is empty: " + e);
                e.getMessage();
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            e.toString();
        } finally {
            System.out.println("\nAll exceptions are handled!");
        }
    }
}

public class Exp5 {
    public static void main(String[] args) {
        ExceptionsHandling obj = new ExceptionsHandling();
        obj.performArithmetic();
        obj.handleArrayIndex();
        obj.handleStringIndex();
    }
}