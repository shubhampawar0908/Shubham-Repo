package interfacedemo;

interface Shape{
	
	void getArea();
	void getPerimeter();
	
}

class Circle implements Shape
{
        int radius;


	public Circle(int radius)
       {
    	   this.radius=radius;
       }
	
	public void getArea() {
		
		System.out.println("the Area of circle is:"+(3.14f*this.radius*this.radius));
		
		
	}

    
	public void getPerimeter() {
		System.out.println("the perimeter of circle:"+(2*3.14f*this.radius));
		
	}
	
}

class Rectangle implements Shape
{      
	int i,w;
      public Rectangle(int i, int w)
      {
    	  this.i=i;
    	  this.w=w;
      }
	@Override
	public void getArea() {
		
		System.out.println("The area of Rectangle is:"+(this.i*this.w));
		
	}

	@Override
	public void getPerimeter() {
		 System.out.println("The perimeter Of Rectangle is:"+(2*this.i+2*this.w));
		
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		
		Circle c=new Circle(5);
		c.getArea();
		c.getPerimeter();
        
		Rectangle r=new Rectangle(4,5);
		r.getArea();
		r.getPerimeter();
	}

}
