package MethodAssignment;

public class Pet {
	
	String name;
	String breed;
	
	public Pet (String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	void display ()
	{
		System.out.println(name+" "+breed);
	}

	public static void main(String[] args) {
		
		Pet s1=new Pet("Tommy","Husky");
		Pet s2=new Pet("Jimmy","Pug");
		s1.display();
		s2.display();
     
		
	}

}
