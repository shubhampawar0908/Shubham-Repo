package MethodAssignment;

public class Square {
	
	int side;
	
	public Square(int side)
	{
		this.side=side;
	}
    
	
	public int calculateArea()
	{
		return side*side;
		
	}
	public static void main(String[] args) {
		
		Square s=new Square(2);

		System.out.println(s.calculateArea());

	}

}
