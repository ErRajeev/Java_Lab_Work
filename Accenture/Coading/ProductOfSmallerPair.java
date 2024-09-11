import java.util.*;

public class ProductOfSmallerPair {
    public static int prodSmlPair(int sum, int[] arr) {
        if (arr.length == 0) {
            return -1;
        } else {
            Arrays.sort(arr);
            if ((arr[0] + arr[1]) < sum) {
                return arr[0] * arr[1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // int sum = 9;
        int sum = 4;
        // int[] arr = { 5, 2, 4, 3, 9, 7, 1 };
        int[] arr = { 9, 8, 3, -7, 3, 9 };
        System.out.println(prodSmlPair(sum, arr));
    }
}
