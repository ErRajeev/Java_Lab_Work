import java.util.*;

class Arrays {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            al.add(i);
        al.add(1, 200);
        System.out.println(al.size());
        for (Object e : al)
            System.out.println(e);
    }
}
