package Basics;

public class ArrayPractice {

	public static void main(String[] args) {
		
		
		int a[]= {12,23,56,3,84,347};
		
		int flag=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==12)
			{
				flag=1;
				break;
			}
			else {
				
			}
		}

		if(flag==0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}
	}

}
