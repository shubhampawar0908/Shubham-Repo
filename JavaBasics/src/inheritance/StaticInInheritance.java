package inheritance;


class ParentStatic
{
	static int a;
	int b;
	
	static void show()
	{
		System.out.println("In parent class");
	}
	
}
class ChildStatic
{
	static int a;
	static int d;
	
	/*static void show()
	{
	System.out.println("In child class ");
	}*/
	

}

public class StaticInInheritance {

	public static void main(String[] args) {
           
		
	    ParentStatic.a=45;
	    ChildStatic.a=34;
	   ParentStatic.show();
	   
	    System.out.println(ParentStatic.a);
	    System.out.println(ChildStatic.a);
	    
	    ParentStatic ps= new ParentStatic();
	    ChildStatic cs=new ChildStatic();
	    
	  //  ps.show();
	   // cs.show();
	    
	}

}
