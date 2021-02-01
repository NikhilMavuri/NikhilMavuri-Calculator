package com.epam.app;

public class Operations {
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public int mul(int num1,int num2)
	{
		return  num1*num2;
	}
	public float div(int num1,int num2)
	{
		try {
			if(num2!=0)
			return (float)num1/num2;
			else
				throw new Exception("ZeroDivisionError");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
		
	}
}
