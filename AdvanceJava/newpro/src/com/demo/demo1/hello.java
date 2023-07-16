package com.demo.demo1;

interface it1 {
	int a=100;
	void m1();
}

interface it2 extends it1{
	int a=200;
	void m2();
}
class Demo22 implements it2
{
	void check()
	{
		System.out.println(it1.a);
		System.out.println(it2.a);
	}

	public void m1() {
		
		System.out.println("m1 is running");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	
}
class Demo33 extends Demo22
{
	
}
public class hello {
public static void main(String[] args) {
	Demo22 d=new Demo22();
	d.check();
	d.m1();
}
}
