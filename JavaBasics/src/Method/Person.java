package Method;

public class Person {
	
	String name;
	String add;
	int age;
     
	void setDetails(String name,String add,int age)
	{
		this.name=name;
		this.add=add;
		this.age=age;
	}
	
	void getDetail()
	{
	   System.out.println("Name is "+this.name+" Address is "+this.add+" Age is "+this.age);
	}
  

	public static void main(String[] args) {
		
	 Person sp=new Person();
	 
	 sp.setDetails("Shubham","Pune",22);
	 sp.getDetail();
	 

	}

}
