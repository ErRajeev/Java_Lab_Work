package com.core_pro.corecode;
import java.util.*;
class Flipkart
{
	//payment-->COD--->credite card-->debitevard
	//UPI-->nety bank-->wallets
	void Payment()
	{
		System.out.println("payment is done");
	}
	void Payment(double d)
	{
		System.out.println("payment is done");
	}
	void Payment(double d,float f)
	{
		System.out.println("payment is done");
	}
	void Payment(float f,double d)
	{
		System.out.println("payment is done");
	}
	
	
	
	
	
}
public class overload {

	public static void main(String[] args) {
		BAckup b=new BAckup();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter name/email/mobino");
//		if()
		b.ForgotPaswword(488);
		
	}
}
class BAckup
{
	void ForgotPaswword(int mobi)
	{
		System.out.println("send OTP");
	}
	void ForgotPaswword(String name)
	{
		System.out.println("send OTP");
	}
	void ForgotPaswword(String name,String email)
	{
		System.out.println("send OTP");
	}
}