package inheritanceassignment;

class Person
{
	private int id;
	private double hourlyPlay;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getHourlyPlay() {
		return hourlyPlay;
	}



	public void setHourlyPlay(double hourlyPlay) {
		this.hourlyPlay = hourlyPlay;
	}



	public Person(int id,double hourlyPlay)
	{
		this.id=id;
		this.hourlyPlay=hourlyPlay;
	}
}

class Employee extends Person
{

	public Employee(int id, double hourlyPlay) {
		super(id, hourlyPlay);
		
	}
	
	public double getRaise()
	{
		return this.getHourlyPlay();
	}
	
}

public class Assign7 {

	public static void main(String[] args) {
		
		
		Employee e=new Employee(45,45667);
		//e.setHourlyPlay(54457);
		e.getHourlyPlay();
		
		System.out.println(e.getRaise());

	}

}
