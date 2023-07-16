package com.core_pro.corecode;
import java.util.*;
public class Authentication {
	Scanner sc=new Scanner(System.in);
	String Uname="Admin123";
	String Upass="admin@123#";
   void Login()
   {
	   System.out.println("Enter User name");
	   String name=sc.next();
	   System.out.println("enter password");
	   String pass=sc.next();
	   Payements p=new Payements();
	   if(Uname.equals(name) && Upass.equals(pass))
	   {
		   System.out.println("login succusfull");
		   System.out.println("choice payment method");
		   System.out.println("Gpay\nphonepay\nAmezon\npaytm");
		   Object o=sc.next();
		   if(o.equals("gpay"))
		   {
			   Gpay g=new Gpay();
			   int catchotp=p.GenOTP();
			   System.out.println("enter your OTP");
			   int matchotp=sc.nextInt();
			   if(catchotp==matchotp)
			   {
				   g.mess();
			   }
			   
			  
		   }
		   else if(o instanceof phonepay)
		   {
			   phonepay p1= new phonepay();
		   }
		   else  if(o instanceof Amezon)
		   {
			   Amezon a=new Amezon();
		   }
		  
	   }
	   else
	   {
		   System.out.println("login failed");
	   }
   }
}
