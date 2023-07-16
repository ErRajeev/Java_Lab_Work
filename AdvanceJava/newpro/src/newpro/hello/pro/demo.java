package newpro.hello.pro;

class Demo implements it1,it2
{

	@Override
	public void m2() {
System.out.println("hello m1 is running..");		
	}

	@Override
	public void m1() {
		System.out.println("hello m1 is running..");		
		
	}
	
}



public class demo {
public static void main(String[] args) {
	Demo d=new Demo();
	d.m1();
	d.m2();
}
}
