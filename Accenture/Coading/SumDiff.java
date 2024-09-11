public class SumDiff {
    public static int diffOfSum(int n, int m) {
        int sumNotDiv = 0;
        int sumDiv = 0;
        for (int i = 1; i <= m; i++) {
            if ((i % n) != 0)
                sumNotDiv += i;
            else
                sumDiv += i;
        }
        return sumNotDiv - sumDiv;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        int res = diffOfSum(n, m);
        System.out.println(res);
    }
}
