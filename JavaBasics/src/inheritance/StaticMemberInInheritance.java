package inheritance;

class Parent
{
	static int a ;
	static int x;
	int c;
	static void hey()

	{
		
		System.out.println(Parent.a);
		//System.out.println(Subclass.b);
	}
	void showParent()
	{
		
		System.out.println("This is parent class");
		//Subclass.a=144;
		System.out.println(Subclass.a);
	}
	
	
}

class Subclass extends Parent
{
	static int a;
	static int d;
	   int b=23;
	  static void showSubclass()
	{	 
		  System.out.println(Parent.a);
		// System.out.println(b);

	//	System.out.println(Subclass.b);
		System.out.println("This is child class");
	}
	
     void hi()
	{
    	
    	Subclass.a=235;
		System.out.println(Parent.a);
		System.out.println(Subclass.a);
		//System.out.println(Subclass.b);
	}
	
}

public class StaticMemberInInheritance {

	public static void main(String[] args) {
		Subclass s=new Subclass();
		Subclass.a=144;
	//	s.showParent();
		s.hi();
		Subclass.x=12;
		
		
	//    System.out.println(Parent.x);
	   
		
	}

}
