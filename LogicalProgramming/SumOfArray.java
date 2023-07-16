import java.util.Scanner;

class SumOfArray {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array !!");
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        int res = 0;
        System.out.println("Enter All Elements");
        for (int i = 0; i < sz; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < sz; i++)
            res = res + arr[i];
        System.out.print("Totle : " + res);
        sc.close();
    }
}