import A.*;
import B.Sample2;

public class Test {
    public static void main(String... args) {
        Sample1 obj1 = new Sample1();
        obj1.printName();

        Sample2 obj2 = new Sample2();
        obj2.printName();

        C.Sample3 obj3 = new C.Sample3();
        obj3.printName();
    }
}
