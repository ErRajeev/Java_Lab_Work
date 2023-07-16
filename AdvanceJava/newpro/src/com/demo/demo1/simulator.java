package com.demo.demo1;

public class simulator {
public static void main(String[] args) {
	Person p=new Person(22,"suresh",886.7f);
	Person p1=new Person(24,"rangaa",89.56f);
	System.out.println("person details");
	System.out.println("age "+p.getAge());
	System.out.println("name "+p.getName());
	System.out.println("sal "+p.getSal());
	System.out.println("person details");
	System.out.println("age "+p1.getAge());
	System.out.println("name "+p1.getName());
	System.out.println("sal "+p1.getSal());
}
}
