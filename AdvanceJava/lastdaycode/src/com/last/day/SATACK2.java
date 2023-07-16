package com.last.day;

class demo2 {
	void shree(int n) {// --push()
		//System.out.println("->"+n);
		if (n < 5) {
			System.out.print(n);
			shree(n + 1);// recursion
		}
		System.out.print(n);
	}// --pop
		// 01234543210
}

public class SATACK2 {
	static int n;

	public static void main(String[] args) {

		demo2 n1 = new demo2();
		n1.shree(n);
	}
}
