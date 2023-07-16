import java.util.Scanner;

public class JackedArray {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size");
        int n = sc.nextInt();
        int arr[][] = new int[n][];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++){
            System.out.println("Enter column Size");
            arr[i][j]= sc.nextInt();
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.println("Enter " + i + " " + j + " Element");
                arr[i][j] = sc.nextInt();
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
