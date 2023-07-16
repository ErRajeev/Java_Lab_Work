package com.core_pro.corecode;

class Father1 {
	int a = 8;

	void m1() {
		System.out.println("m1 in father class");
	}
	
	
}

class Son1 extends Father1 {

	int a = 9;

	void m1() {
		System.out.println("m1 in son1 class");
		System.out.println("member a value " + this.a);
		System.out.println("super class a value " + super.a);
		super.m1();
	}

}

class Chaild extends Son1 {
	int a = 11;

	void m1() {

		System.out.println("m1 in chaild class");
		System.out.println("member a value " + this.a);
		System.out.println("super class a value " + super.a);
	}

	void display() {
		this.m1();
		super.m1();
	}
}

public class inheri {

	public static void main(String[] args) {
		Chaild s = new Chaild();
		s.display();
	}

}
