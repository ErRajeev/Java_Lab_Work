package com.core_pro.corecode;

abstract class data {
	abstract void info();
//class abstraction--:0 to 100%
	void m1() {
		System.out.println("hey i am with bodyb or logic");
	}

	// fun
	/*
	 * concrite (non abstract) void name() {
	 * 
	 * } non concrite(abstract fun) void m1();
	 */
}

class exicute extends data {

	@Override
	void info() {
		System.out.println("data is secure");

	}

}

public class abtraction {
	public static void main(String[] args) {
		// abstraction:-hinding implementation(body) and giving
		// functionality to user
		//// hide logics or body give functions names
		data d = new exicute();//100%
		d.info();
		d.m1();
	}
}
