package inheritance;

class Member
{
	String name;
	int age;
	int phoneNumber;
	String address;
	int salary;
	
	void setDetails(String name,int age,int phoneNumber,String address,int salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
		
		
	}
	
	void showInfo()
	{
		System.out.println(this.name+" "+this.age+" "+this.phoneNumber+" "+this.address+" "+this.salary);
	}
	
}

class Employee extends Member
{
	String specialization;
}

class Manager extends Member
{
	String department;
}

public class Ass3 {

	public static void main(String[] args) {
		
		Employee p1=new Employee();
	/*	p1.name="Shubham";
		p1.age=21;
		p1.phoneNumber=123456;
		p1.address="Pune";
		p1.salary=20000;
		*/
		p1.setDetails("Shubham", 21, 1234566,"Pune", 22000);
		p1.showInfo();
		
		Manager p2=new Manager();
		
		/*p2.name="Janhavi";
		p2.age=21;
		p2.phoneNumber=2526456;
		p2.address="Thane";
		p2.salary=25000;
		*/
		p2.setDetails("Akshay", 22,637737 , "Pune", 18000);
		p2.showInfo();
		
	}

}
