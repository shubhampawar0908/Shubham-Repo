package OOPConcept;

public class PersonTwoobject {

	int adharNumber;
	 String fullName;
	 String contactNumber;
	 String panNumber;
	 String bloodGroup;
	 int voterNumber;
	 String address;
	 int age;
	

	public static void main(String[] args) {
		PersonTwoobject p1=new PersonTwoobject();
       p1.adharNumber=2203698;
       p1.fullName="Ruturaj balasaheb raut";
       p1.contactNumber="8432480101";
       p1.panNumber="PCBC2264B10";
       p1.bloodGroup="o+";
       
       System.out.println("Adhar No.= "+p1.adharNumber+" full name= "+p1.fullName+" Conatct= "+p1.contactNumber+
       		" PanNo="+p1.panNumber+" Blood Group="+p1.bloodGroup);
       
       PersonTwoobject p2=new PersonTwoobject();
       p2.voterNumber=26549;
       p2.address="pune";
       p2.age=18;
       
       System.out.println("voter ID= "+p2.voterNumber);
       System.out.println("Adderss= "+p2.address);
       System.out.println("Age= "+p2.age);
		// TODO Auto-generated method stub

	}

}
