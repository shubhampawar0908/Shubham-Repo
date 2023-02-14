package MethodAssignment;

public class GrossSalary {
	
	float salary (float a)
	{
	
	return (10000+(10000*0.08f)+(10000*0.05f)+(10000*0.03f));
	}
	public static void main(String[] args) {
		
		GrossSalary m=new GrossSalary();
		
	   System.out.println(m.salary(0));
		


	}

}
