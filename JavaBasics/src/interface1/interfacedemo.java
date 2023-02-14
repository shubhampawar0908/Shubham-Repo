package interface1;

interface demo
{
	int i=23;
	
	
	default void show()
	{
		System.out.println("default method defined");
		call();
	}
	 static void display()
	{
	  System.out.println("static method defined");
	}
	
	 private void call()
	 {
		 System.out.println("private method defined");
	 }
	
	
}



public class interfacedemo implements demo {

	public static void main(String[] args) {
		
		interfacedemo i=new interfacedemo();
		i.show();
		demo.display();
    
		
		
	}

}
