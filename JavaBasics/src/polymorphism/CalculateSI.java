package polymorphism;

import java.util.Scanner;

public class CalculateSI {
	
	void calculate(float principle,float rate)
	{
		double si=(principle*(1+(rate*5)));
		System.out.println("The Simple Interest is:"+si);
	}
    
	void calculate(float principle,int time)
	{
		double si=(principle*(1+(10*time)));
		System.out.println("The Simple Interest is:"+si);

	}
	
	void calculate(int rate,int time)
	{
		double si=(1000*(1+(rate*time)));
		System.out.println("The Simple Interest is:"+si);

	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle:");
		CalculateSI p=new CalculateSI();
		int principle=sc.nextInt();
		p.calculate(principle, 5);
		p.calculate(principle, 3);
		p.calculate(3, 4);

	}

}
