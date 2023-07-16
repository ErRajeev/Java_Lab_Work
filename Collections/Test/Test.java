package Test;

import java.util.*;
class Test {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()) 
            System.out.println(it.next());
    }
}
