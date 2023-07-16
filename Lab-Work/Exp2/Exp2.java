import java.util.*;

class Exp2 {
    void area(Double r) {
        double res = Math.PI * (r * r);
        System.out.println("Area of Circle " + res);
    }

    static void area(int h, int b) {
        double res = 0.5 * b * h;
        System.out.println("Area of Trangle " + res);
    }

    static int area(int s) {
        int res = s * s;
        return res;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your Choice\n\n1 : Area of Circle\n2 : Area of Trangle\n3 : Area of Sqar");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Radious");
                    double r = sc.nextInt();
                    Exp2 obj = new Exp2();
                    obj.area(r);
                    break;
                case 2:
                    System.out.println("Enter Height and Bridth");
                    int h = sc.nextInt();
                    int b = sc.nextInt();
                    area(h, b);
                    break;
                case 3:
                    System.out.println("Enter Side");
                    int s = sc.nextInt();
                    int res = area(s);
                    System.out.println("Area of Sqar " + res);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            sc.close();
        }
    }
}