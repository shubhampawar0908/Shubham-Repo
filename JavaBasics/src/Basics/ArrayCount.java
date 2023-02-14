package Basics;

import java.util.Scanner;

public class ArrayCount {

	public static void main(String[] args) {
      
		int [] array=new int[5];
		int num;
		int a=45;
	
		int count=0;
		System.out.println("Enter size of array:");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		System.out.println("Enter elements of array:");
		for(int i=0;i<num;i++)
		{
			array[i]=sc.nextInt();		
	    }
		
		for(int i=0;i<num;i++)
		{
			if(a==array[i])
			{
				count=count+1;
			}
		}
		
		System.out.println("The give number is repeated "+count+" times");

		
		
	}

}
