package newpro.hello.pro;

import java.util.*;

class demo34 {
	ArrayList a = new ArrayList();
	TreeSet t = new TreeSet();

	void m1() {
		a.ensureCapacity(1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of students");
		int no = sc.nextInt();
		for (int i = 1; i <= no; i++) {
			System.out.println("enter name");
			String name = sc.next().toUpperCase();
			a.add(name);
		}
		sort();
		display();

	}

	void sort() {

		t.addAll(a);

	}

	void display() {
		System.out.println(t);
	}
}

public class collections {
	public static void main(String[] args) {
		new demo34().m1();
	}
}
