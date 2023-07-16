package newpro.hello.pro;
class demo12
{
	void m1() {
		int a[]= {9,82,7,26,55,4,35,2,15};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				break;
			}
		}
		System.out.println("after sorting ");
		for (int i : a) {
			System.out.print(" "+i);
		}
	}
}
public class sortingi {
public static void main(String[] args) {
	demo12 d=new demo12();
	d.m1();
}
}
