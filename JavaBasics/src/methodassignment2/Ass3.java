package methodassignment2;

class StudentInfo
{
	String name;
	int roll_no;
	int phone_no;
	String address;
	
}

public class Ass3 {

	public static void main(String[] args) {
		
		StudentInfo p=new StudentInfo();
		
	    p.name="Sam";
	    p.roll_no=21;
	    p.phone_no=1234567;
	    p.address="Pune";
        System.out.println(p.name+" "+p.roll_no+" "+p.phone_no+" "+p.address);
        
StudentInfo p1=new StudentInfo();
		
	    p1.name="John";
	    p1.roll_no=22;
	    p1.phone_no=25264567;
	    p1.address="Deccan";
        System.out.println(p1.name+" "+p1.roll_no+" "+p1.phone_no+" "+p1.address);
	}

}
