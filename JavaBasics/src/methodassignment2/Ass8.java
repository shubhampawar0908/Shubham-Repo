package methodassignment2;

import java.util.Scanner;

class Average
{
	int num1;
	int num2;
	int num3;
	
	public Average(int num1,int num2,int num3)
	
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
				
	}
	
	public void calculate()
	{
	   int average=(this.num1+this.num2+this.num3)/3;
	   
	   System.out.println(average);
	   
	}
}

public class Ass8 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
        
		Average s=new Average(num1,num2,num3);
		
         		
		s.calculate();
		
		
		
	}

}
