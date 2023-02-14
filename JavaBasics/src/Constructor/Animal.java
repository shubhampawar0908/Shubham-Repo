package Constructor;

public class Animal {
	
     String name;
     String type;
     String food;
     public Animal()
     {
    	 name="tommy";
    	 type="mammal";
    	 food="pedigree";
    	 
     }
     public Animal(String name,String type, String food)
     {
    	 this.name=name;
    	 this.type=type;
    	 this.food=food;
     }
     void display()
     {
    	 System.out.println(this.name+" "+this.type+" "+this.food);
     }
 

	public static void main(String[] args) {
		
		Animal m=new Animal();
		m.display();
		
		Animal cat=new Animal();
		cat.display();
		
		Animal dog=new Animal("Ron","Husky","Pedigree");
		dog.display();
		
		

		
	}

}
