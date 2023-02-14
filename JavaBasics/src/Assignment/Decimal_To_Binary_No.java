package Assignment;



public class Decimal_To_Binary_No {

	public static void main(String[] args) {
		int arr[]=new int[50],n=12,i;
		
		for(i=0;n>0;i++)
		{
			arr[i]=n%2;
			n=n/2;
		}
		System.out.print("Binary of given number is:");
		for(i=i-1;i>=0;i--)
			System.out.print(arr[i]);
		// TODO Auto-generated method stub

	}

}
