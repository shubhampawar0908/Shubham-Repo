package interfaceassignment;
abstract class Parent
{
	void message()
	{
		
	}
}
class A extends Parent
{
	void message()
	{
		System.out.println("This is first subclass");
	}
}
class B extends Parent
{
	void message()
	{
		System.out.println("This is second subclass");
	}
}

public class Ass1 {

	public static void main(String[] args) {
		
		A a=new A();
		
		a.message();
		
		B b=new B();
		b.message();
		

	}

}
