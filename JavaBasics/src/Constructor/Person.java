package Constructor;

class PersonDetails{
	
         private String name;
         private int age;
         private String address;
         
         public void setName(String name)
         {
        	 this.name=name;
         }
         public void setAge(int age)
         {
        	 this.age=age;
         }
         public void setAddress(String address)
         {
        	 this.address=address;
         }
         
         public String getName()
         {
        	 return name;
         }
         public int getAge()
         {
        	return age;
         }
         public String getAddress()
         {
        	 return address;
         }
        
	
}



public class Person {

	public static void main(String[] args) {
		
		PersonDetails m=new PersonDetails();
		m.setName("Shubham");
		m.setAge(22);
		m.setAddress("Pune");
		
		System.out.println(m.getName() +m.getAddress());

	}

}
