package Basics;

public class MaximumElement {

	public static void main(String[] args) {

		int [] array= {110,26,103,14,72};
        int max=array[0];
        
        for(int i=0;i<5;i++)
        {
        	if(max>array[i])
        	{
        		
        	}
        	else {
        		max=array[i];
        	}
        }
        System.out.println("The maximum number of array is :"+max);
	}

}
