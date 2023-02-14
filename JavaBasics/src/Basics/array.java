package Basics;

public class array {

	public static void main(String[] args) {
		int [] ageArray= {10,12,4,4,4};
		
		int num=4;
		int count=0;
		
		for(int i=0;i<5;i++)
		{
			if(num==ageArray[i])
			{
				count=count+1;
			}
		}
		System.out.println("The given number is repeated "+count+" times");
	}

}
