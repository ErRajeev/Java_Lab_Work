package com.core_pro.corecode;

class demo22 {
	public  void m1(int...a)
	{
//		System.out.println("m1 is running..a "+a+"b "+b+"c "+c);
		for (int i : a) {
			System.out.println(i);
		}
	}
 static	void m2()
	{
		System.out.println("m2 is running..");
	}
}

public class polymorpism {
	public static void main(String[] args) {
//		demo22 d = new demo22();
//		// d.m1();
		new demo22().m1(10,20,30,46,8,37,8,2,49,85,74);
		System.out.println("static member calling");
		demo22.m2();
	}

	

}
