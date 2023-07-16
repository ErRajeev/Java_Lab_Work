package PrintingPattern;

public class NumberPrint2 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + "   ");
            }
            System.out.println("\n");
        }
    }
}
