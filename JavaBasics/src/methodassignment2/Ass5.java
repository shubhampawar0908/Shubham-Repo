package methodassignment2;

class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public int Area()
	{
		return this.length*this.breadth;
	}
}

public class Ass5 {

	public static void main(String[] args) {
		
		Rectangle s=new Rectangle(4,5);
		
		System.out.println("Area of rectangle is:"+s.Area());
		
		Rectangle s1=new Rectangle(5,8);
		System.out.println("Area of rectangle is:"+s1.Area());

		


	}

}
