package Array;

public class ArrayOfFloats {

	public static void main(String[] args) {
		
		float [] marks= {45.5f,34.5f,26.5f,27.5f,47.5f};
		
		float sum=0;
		
		for(float element:marks)
		{
			sum=sum+element;
		}
		
        System.out.println("The Sum of all Elements is:"+sum);
	}

}
