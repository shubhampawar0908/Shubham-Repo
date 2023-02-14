package Basics;

public class MinimumElement {

	public static void main(String[] args) {
         
		int [] array= {12,26,36,14,72};
		int min=array[0];
		
		for(int i=0;i<5;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
			else {
				
			}
		}
		System.out.println("The Minimum number of array is :"+min);
	}

}
