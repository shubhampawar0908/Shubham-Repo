package OOPConcept;

public class Employee {

	int employeeId;
	String employeeName;
	String designation;
	int salary;
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.employeeId=101;
		e1.employeeName="Shubham";
		e1.designation="Developer";
		e1.salary=30000;
		
		System.out.println("Employee ID= "+e1.employeeId);
		System.out.println("Employee Name= "+e1.employeeName);
		System.out.println("Employee Designation= "+e1.designation);
		System.out.println("Employee salary= "+e1.salary);
		// TODO Auto-generated method stub

	}

}
