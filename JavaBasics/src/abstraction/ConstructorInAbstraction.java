package abstraction;

abstract class Bicycle
{
	public Bicycle()
	{
		System.out.println("Bicycle default constructor");
	}
	public Bicycle (String msg)
	{
		System.out.println(msg);
	}
	
	
}

class MountainBicycle extends Bicycle
{
	
	public MountainBicycle()
	{
		System.out.println("Mountain default constructor");
	}

	public MountainBicycle(String msg) {
		
		System.out.println(msg);

	}
	
	void display()
	{
		System.out.println("Type of bicycle...");
	}
	
}
public class ConstructorInAbstraction {

	public static void main(String[] args) {
		
		MountainBicycle m=new MountainBicycle();
		m.display();
		MountainBicycle c=new MountainBicycle("Mountain Bicycle");
		m.display();
		
		
		

	}

}
