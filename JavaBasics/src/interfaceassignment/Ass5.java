package interfaceassignment;

abstract class Animal
{
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animal
{

	
	void cats() {
		
		System.out.println("Cats Meow");
	}


	void dogs() {
		
		
	}
	
}
class Dogs extends Animal
{
	void dogs()
	{
		System.out.println("Dogs bark");
	}
     void cats() {
		
		
	}
}

public class Ass5 {

	public static void main(String[] args) {
		
		Cats c= new Cats();
		c.cats();
		Dogs d=new Dogs();
		d.dogs();
        
	}

}
