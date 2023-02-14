package inheritance;


class Circle1
{
	void call ()
	{
		System.out.println("hey ");
	}
	
	 void display()
	{
	  System.out.println("Parent method defined");
	}
}

class Cylinder extends Circle1
{
	  void display()
		{
		  System.out.println("Child method defined");
		}
}
public class Ass6 {

	public static void main(String[] args) {

		Circle1 c=new Cylinder();
		
		c.display();
		c.call();
		
	}

}
