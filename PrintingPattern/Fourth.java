package PrintingPattern;

public class Fourth {
    public static void main(String arg[]) {
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
