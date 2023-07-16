import java.util.Scanner;

class Inner01 {

    class B {
        private int x;
        private int y;

        public void get() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x + y);
            sc.close();
        }
    }
    public static void main(String arg[]) {
        Inner01 obj = new Inner01();
        Inner01.B obj1 = obj.new B();
        obj1.get();
    }
}
