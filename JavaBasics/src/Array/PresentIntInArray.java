package Array;

public class PresentIntInArray {

	public static void main(String[] args) {
		
		int[] marks= {56,24,27,33,35,24};
		int num=24;
		boolean inArray=false;
		
		
		/*for(int i=0;i<marks.length;i++)
		{
			if(num==marks[i])
			{
				inArray=true;
				break;
			}
		}
		if(inArray)
		{
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element Not Found");
		}
		 */
		
		
		
		   for(int elements:marks)
		   {
			   if(num==elements)
			   {
				   System.out.println("Element Found");
				   return;
			   }
			   
			 
		   }
		   
		   {
			   System.out.println("Element Not Found");
		   }
		
			   
		
		
		

	}
	

}
