
abstract class A {
    public abstract void show();

    public abstract void show2();
}

// To Create Anonimus class we need An abstract Method or Interface

class AnonimusInner {
    public static void main(String[] args) {

        A obj = new A() { // Hear we Create a Body of Anonimus class Not a
            public void show() {
                System.out.println("This is Anonimus Class");
            }

            public void show2() {
                System.out.println("This is show 2");
            }
        };
        obj.show();
        obj.show2();
    }
}
