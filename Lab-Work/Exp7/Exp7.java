import java.util.*;

class Exp7 {

    public void linkFunction(Scanner sc) {
        LinkedList<Integer> ll = new LinkedList<>();
        ListIterator<Integer> it = ll.listIterator();
        while (true) {
            System.out.println(
                    "1 : Add Element\n2 : Add First\n3 : Create clone\n4 : Print all Elements\n5 : Find Size of Linked List\n6 : Get Ele by Index\n7 : Find the Ele\n8 : Remove Element by Index");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a number");
                    ll.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter a number");
                    ll.addFirst(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter a number");
                    Object newll = (Object) ll.clone();
                    System.out.println("New Clone of Linked list is " + newll);
                    break;
                case 4:
                    System.out.println("Print all Linked List Element");
                    while (it.hasNext())
                        System.out.println(it.next());
                    break;
                case 5:
                    System.out.println("Size of Linked List " + ll.size());
                    break;
                case 6:
                    System.out.println("Enter Element index Number");
                    ll.get(sc.nextInt());
                    break;
                case 7:
                    System.out.println("What you want to find");
                    System.out.println(ll.contains(sc.nextInt()));
                    break;
                case 8:
                    System.out.println("Enter Index Number");
                    System.out.println("Element " + ll.remove(sc.nextInt()) + " Removed");
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
    }

    public void arrFunction(Scanner sc) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (true) {
            System.out.println("1 : Add Element\n2 : Add Element in Index\n3 : Array isEmpty\n4 : Get index value");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a Number");
                    al.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Position");
                    System.out.println("Then enter a Number");
                    al.add(sc.nextInt(), sc.nextInt());
                    break;
                case 3:
                    System.out.println(al.isEmpty());
                    break;
                case 4:
                    System.out.println("Enter element");
                    System.out.println(al.indexOf(sc.nextInt()));
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
    }

    public void hashSetFunction(Scanner sc) {
        HashSet<Object> hs = new HashSet<Object>();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Array List\n2 : Linked List\n3 : Hash Set");
        int ch = sc.nextInt();
        Exp7 obj = new Exp7();
        switch (ch) {
            case 1:
                obj.arrFunction(sc);
                break;
            case 2:
                obj.linkFunction(sc);
                break;
            case 3:
                obj.hashSetFunction(sc);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        sc.close();
    }
}