import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number;
            number = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Number format exeception");
            e.toString();
        }
    }
}
