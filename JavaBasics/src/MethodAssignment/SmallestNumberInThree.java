package MethodAssignment;

import java.util.Scanner;

public class SmallestNumberInThree {

	void getSmallestNumber()
	{   
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		if ((a<b)&&(a<c)) 
			{
				System.out.println("smallest number among three number is: "+a);
			}
		
		else if ((b<a)&&(b<c)) 
			 {
				System.out.println("smallest number among three number is: "+b);
			}
		
		else
		{
			System.out.println("smallest number among three number is: "+c);
		}
		return;
	}
	
	

	public static void main(String[] args) {
		
		SmallestNumberInThree sn=new SmallestNumberInThree();
		sn.getSmallestNumber();
		// TODO Auto-generated method stub

	}

}
