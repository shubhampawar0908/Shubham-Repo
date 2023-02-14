package Constructor;

public class Rectangle {
	
	int length;
	int width;
	
	public Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public void calculateArea()
	 {
	     int area = length*width;
	     int perimeter=2*(length+width);
	     System.out.println(area);
	     System.out.println(perimeter);
	}
     

	public static void main(String[] args) {
		
		Rectangle v=new Rectangle(4,5);
		
		v.calculateArea();
		
		// TODO Auto-generated method stub

	}

}
