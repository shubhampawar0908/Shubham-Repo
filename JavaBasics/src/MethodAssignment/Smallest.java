package MethodAssignment;

import java.util.Scanner;

public class Smallest {
	
	int smallNumber(int a,int b)
	{
		if(a<b)
	    return a;
		else
		return b;
	}

	public static void main(String[] args) {
		Smallest m=new Smallest();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Smallest number is:"+m.smallNumber(a, b));
		// TODO Auto-generated method stub

	}

}
