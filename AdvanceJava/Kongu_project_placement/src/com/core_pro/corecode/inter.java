package com.core_pro.corecode;
interface it1
{  int a=10000;
	 void m1();
	 void m2();
	//100%
	
}
interface it2
{
	void m3();
}
/*
 * class to class -->extends
 * interface to class -->implements
 * class to interface-->not posiible
 * interface to interface -->extends
 */
 class Demo5 implements it1,it2
{

	@Override
	public void m1() {
		System.out.println("m1 is implemented");
		
	}

	@Override
	public void m2() {
	System.out.println("m2 is implemented");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 is running");
	}
	
}
public class inter {
public static void main(String[] args) {
	it1 d=new Demo5();

	System.out.println(d.a);
	d.m1();
	d.m2();
	d.m3();
}
}
