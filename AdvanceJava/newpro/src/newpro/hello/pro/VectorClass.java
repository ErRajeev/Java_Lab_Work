package newpro.hello.pro;
import java.util.*;

public class VectorClass {
	public static void main(String args[]) {
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=10;i++) {
			a.add(sc.nextInt());
		}
		Vector<Integer> v = new Vector<>();
		v.addAll(a);
		System.out.println(a.toString());
	}
	
}
