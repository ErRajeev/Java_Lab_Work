package com.core_pro.corecode;
//object:-marker

//states->fixed;-color brand
//behavior:-functionalities;-write stop writing

//class
class Marker {
	// states
	String color = "red";
	int price = 20;
	String brand = "camlin";

	void startwrite() {
		System.out.println("marker started writing");

	}

	void stopwriting() {
		System.out.println("marker stoped writing");
	}
}
class markers extends Marker
{
	
}
public class Demo {
	static Marker m = null;
	static int i=1;
	public static void main(String[] args) {
	
		for ( i = 0; i < 1000000; i++) {
			m = new Marker();
			
		}
		System.out.println("no of markers available "+i);
		System.out.println("color is " + m.color);
		System.out.println("brand is " + m.brand);
		m.startwrite();
		m.stopwriting();
		markers m2=new markers();
		System.out.println("new company");
		m2.startwrite();
		m2.stopwriting();
		
	}
}
