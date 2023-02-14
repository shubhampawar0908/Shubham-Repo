package finalbasic;

class Demo

{
   void display()
     {
    	 System.out.println("Hey");
     }
     
  
           

}
class Basic extends Demo
{
	void display(int a) 
	{
		System.out.println("Hey there");
	}
}

public class FinalDemo {
	


	public static void main(String[] args) {
		
		 Basic d=new  Basic();
		d.display();
		//d.show();
		

	}

}
