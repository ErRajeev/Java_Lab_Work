package com.core_pro.corecode;
import java.util.*;
public class Payements {
	Random rand=new Random();
	int  GenOTP()
	{
		int OTP=rand.nextInt();
		System.out.println("your OTP is "+OTP);
		return OTP;
	}

}
