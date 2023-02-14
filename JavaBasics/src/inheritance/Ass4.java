package inheritance;

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public int printArea()
	{
		return this.length*this.breadth; 
	}
	
	public int printPerimeter()
	{
		return 2*(this.length+this.breadth);
	}
}

class Square extends Rectangle
{
	int side;
	
	public Square( int length, int breadth,int side)
	{
		
		super(length,breadth);
	

		this.side=side;
	}
	
	public int printArea1()
	{
		return this.side*this.side;
	}
	
	public int printPerimeter1()
	{
		return 4*this.side;
	}
}

public class Ass4 {

	public static void main(String[] args) {
       
		Rectangle s=new Rectangle(12,5);
		System.out.println("Area of rectangle is:"+s.printArea());
		System.out.println("Perimeter of rectangle is:"+s.printPerimeter());
	    
		Square s1=new Square (10,12,5);
		System.out.println("Area of square is:"+s1.printArea1());
		System.out.println("Perimeter of square is:"+s1.printPerimeter1());
	//	System.out.println("Area of rectangle is:"+s1.printArea());
	//	System.out.println("Perimeter of rectangle is:"+s1.printPerimeter());
		
		
	}

}
