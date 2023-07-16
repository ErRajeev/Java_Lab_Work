package com.demo.demo1;

public class Person {
//class should be public
//private var//members 
	// public setter public getter
	private int age = 23;
	private String name = "suresh";
	private float sal = 1000000.56f;

	Person()
	{
		System.out.println("defulat cons");
	}
	Person(int age,String name,float sal)
	{
		this.age=age;
		this.name=name;
		this.sal=sal;
		System.out.println(" cons is created");
	}
	public void setAge(int a) {
		this.age = a;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
}
