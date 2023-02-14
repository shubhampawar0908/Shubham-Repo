package MethodAssignment;

import java.util.Scanner;

public class Greatest {
	
	void greatestNumber (int num1, int num2)
	{
		if(num1>num2)
		{
			System.out.println("Gretest number is:"+num1);
		}
		else
		{
			System.out.println("Greatest number is:"+num2);
		}
	}

	public static void main(String[] args) {
		
		Greatest m=new Greatest();
		
	   int num1,num2;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a num:");
	   num1=sc.nextInt();
	   num2=sc.nextInt();
	   
	   m.greatestNumber(num1,num2);
	   
	
		
		// TODO Auto-generated method stub

	}

}
