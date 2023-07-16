class ReturnArray {
    static int[] ex() {
        int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] + 2;
        return arr;
    }

    public static void main(String arg[]) {
        int[] arr = ex();
        for (int i : arr)
            System.out.println(i);
    }
}