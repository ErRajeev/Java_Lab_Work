package PrintingPattern;

public class PiramindPrint {
    public static void main(String arg[]) {
        int n = 5, c = 10, i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (c / 2 - i); j++) {
                System.out.print("\t");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
