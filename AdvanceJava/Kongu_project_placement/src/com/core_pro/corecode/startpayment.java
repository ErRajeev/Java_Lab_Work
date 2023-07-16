package com.core_pro.corecode;
import java.util.*;
interface User
{
	void withdrw();
	void transfer();
	void checkBal();
}
class Bank implements User
{   Scanner sc=new Scanner(System.in);
	static int bank_bal=10000000;

	@Override
	
	public void withdrw() {
		System.out.println("enter amt");
		System.out.println(bank_bal-sc.nextInt());
		
	}

	@Override
	public void transfer() {
		System.out.println("amount sent succusfully..");
		
	}

	@Override
	public void checkBal() {
		System.out.println(this.bank_bal);
		
	}
	
}
public class startpayment {
public static void main(String[] args) {
	
	User b=new Bank();
	b.withdrw();
	b.checkBal();
	b.transfer();
}
}
