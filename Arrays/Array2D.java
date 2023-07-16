import java.util.Scanner;

class Array2D {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Students");
        int n = sc.nextInt();
        System.out.println("Enter no of Subjects");
        int ns = sc.nextInt();
        String student[][] = new String[n][ns];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < ns; j++)
                student[i][j] = sc.next();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ns; j++)
                System.out.print(student[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
