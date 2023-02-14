package Array;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		int numbers[]=new int [10];
		int data;
		int sum=0;
		float avg;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array elements");
		
		for(int r=0;r<10;r++)
		{
			data=sc.nextInt();
			numbers[r]=data;
		}
		for(int r=0;r<10;r++)
		{
			System.out.println(numbers[r]);
		}
		

				// TODO Auto-generated method stub

	}

}
