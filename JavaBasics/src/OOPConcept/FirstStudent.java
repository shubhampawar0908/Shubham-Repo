package OOPConcept;

public class FirstStudent {

	int rollNumber;
	 String fName, lName;
	 int contactNumber;
	 String email;
	 float percentage;

	public static void main(String[] args) {
		FirstStudent s1=new FirstStudent();
		s1.rollNumber=101;
		s1.fName="Shubham";
		s1.lName="Pawar";
		s1.contactNumber=843248;
		s1.email="shubhampawar98@gmail.com";
		s1.percentage=81.20f;
		
		System.out.println(s1.rollNumber +s1.fName+s1.lName +s1.contactNumber +s1.email +s1.percentage);

	}

}
