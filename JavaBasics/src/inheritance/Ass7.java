package inheritance;

class Rectangle2 
{
	int length;
	int width;
	int height;
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}

class Cuboid extends Rectangle2
{
	
	

	public int  claculateArea()
	{
		
		return  ((2*this.height*this.width)+(2*this.length*this.height)+(2*this.height*this.width));
		
	}
}

public class Ass7 {

	public static void main(String[] args) {
		
		
		Cuboid s=new Cuboid();
	     
		s.setHeight(4);
		s.setLength(5);
		s.setWidth(5);
//        int sum=s.claculateArea();
//        System.out.println(sum);
		System.out.println(s.claculateArea());

	}

}
