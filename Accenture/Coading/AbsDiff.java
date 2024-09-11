class AbsDiff {
    public static int findCount(int[] arr, int len, int num, int diff) {
        int count = 0;
        for (int i : arr) {
            if (Math.abs(i - num) <= diff) {
                count++;
            }
        }
        return count;
    }

    public static void main(String... arg) {
        int[] arr = { 12, 3, 14, 56, 77, 13 };
        int diff = 2;
        int num = 13;
        int len = 6;
        int res = findCount(arr, len, num, diff);
        System.out.println(res);
    }
}
