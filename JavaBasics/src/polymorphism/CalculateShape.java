package polymorphism;

class Shape
{
	void calculate(int l,int w)
	{
		int area=l*w;
		System.out.println("Area of rectamgle is:"+area );
	}
	
	void calculate(int side)
	{
		int area=side*side;
		System.out.println("Area of square is:"+area );
	}
	void calculate(float r)
	{
		float area=3.14f*r;
		System.out.println("Area of circle is:"+area );
	}
	void calculate(float b,int h)
	{
		float area=1/2*(b*h);
		System.out.println("Area of triangle is:"+area );
	}
}

public class CalculateShape {

	public static void main(String[] args) {
		
		Shape s=new Shape();
		s.calculate(10, 12);
		s.calculate(5);
		s.calculate(1.4f);
		s.calculate(4.1f, 5);

	}

}
