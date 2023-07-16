import java.util.Scanner;
// class Array {
//     public static void main(String arg[]) {
//         int[] arr = { 1, 2, 3, 4, 5 };
//         for (int e : arr)
//             System.out.println(e);
//     }
// }

class Array {
    static int[] arr = new int[20];
    static Scanner sc = new Scanner(System.in);

    static int get() {
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return n;
    }

    static void put(int n) {
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

    public static void main(String arg[]) {
        int n = get();
        put(n);
    }
}