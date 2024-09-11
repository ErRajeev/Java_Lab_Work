public class SumOfLeaders {
    public static int somofleader(int[] arr) {
        if (arr.length == 0) {
            return -1;
        } else {
            int sum = arr[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (arr[i] < arr[j]) {
                        sum += arr[j];
                    }
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 52, 66, 64, 36, 45, 24, 32 };
        int res = somofleader(arr);
        System.out.println(res);
    }
}
