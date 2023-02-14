package interfaceassignment;

abstract class Pcon
{
	abstract void a_method();
	
	void show()
	{
		System.out.println("This is normal method of abstract class");
	}
	
	public Pcon()
	{
		System.out.println("This is the constructor of abstract class");
	}
	
}

class SubClass extends Pcon
{

	void a_method() {
		super.show();
		System.out.println("This is abstract method");
		
	}
	
}


public class Ass4 {

	public static void main(String[] args) {
		
		SubClass m=new SubClass();
		m.a_method();

	}

}
