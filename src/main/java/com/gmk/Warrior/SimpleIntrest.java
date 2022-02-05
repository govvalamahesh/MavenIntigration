package com.gmk.Warrior;

public class SimpleIntrest {

	public float findSimpleIntrest(float principalAmount, float  rateOfIntrest, float time)
	{
		float SI = (principalAmount*rateOfIntrest*time)/100;
		return SI;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hii");
		SimpleIntrest si = new SimpleIntrest();
		float f= si.findSimpleIntrest(37000, 2, 7);
		System.out.println("SImple Intrest"+f);
	}
}
