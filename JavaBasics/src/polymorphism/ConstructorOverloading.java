package polymorphism;

class Shape1
{
	
	int length,breadth,side;float height;float radius;
	
	public Shape1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public Shape1(int side)
	{
		this.side=side;
	}
	
	public Shape1(float radius)
	{
		this.radius=radius;
	}
	public Shape1(int breadth, float hieght)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void calculate()
	{
		int area=this.length*this.breadth;
		int areaSquare=this.side*this.side;
		float areaCircle=3.14f*this.radius*this.radius;
		System.out.println("Area of rectamgle is:"+area );
		System.out.println("Area of square is:"+areaSquare);
		System.out.println("Area of circle is:"+area );
	}
	
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		

	}

}
