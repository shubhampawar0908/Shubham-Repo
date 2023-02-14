package inheritance;

class Shape 
{
	void displayShape()
	{
		System.out.println("This is shape");
	}
}

class Rectangle1 extends Shape
{
	void displayRectangle()
	{
		
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape
{
	void displayCircle()
	{
		System.out.println("This is circular shape");
	}
}

class Square1 extends Rectangle1
{
	void displaySquare()
	{
	   
		
		System.out.println("Square is rectangle");
	}
}


public class Ass5 {

	public static void main(String[] args) {
		
		Square1 s=new Square1();
		
	    

	}

}
