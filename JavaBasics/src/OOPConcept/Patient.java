package OOPConcept;

public class Patient {

	int pID;
	String pName;
	String pdiseases;
	String pMobileNo;

	public static void main(String[] args) {
		Patient p1=new Patient();
		p1.pID=102;
		p1.pName="Ruturaj";
		p1.pdiseases="Fever";
		p1.pMobileNo="8432480101";
		
		System.out.println("Patient ID: "+p1.pID);
		System.out.println("Patient Name: "+p1.pName);
		System.out.println("Patient Disease: "+p1.pdiseases);
		System.out.println("Patient Mobile No: "+p1.pMobileNo);
        
		// TODO Auto-generated method stub

	}

}
