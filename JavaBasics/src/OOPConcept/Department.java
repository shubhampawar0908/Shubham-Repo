package OOPConcept;

public class Department {

	String dName;
	String dGroupId;
	int dPersons;
	int dLadies;

	public static void main(String[] args) {
		Department d1=new Department();
		d1.dName="GUI navigation";
		d1.dGroupId="F102";
		d1.dPersons=105;
		d1.dLadies=55;
		
		System.out.println("Name of Department: "+d1.dName);
		System.out.println("Group ID No.: "+d1.dGroupId);
		System.out.println("NO. of Peoples in the Department: "+d1.dPersons);
		System.out.println("NO. of Ladies in the Department: "+d1.dLadies);
	}
		// TODO Auto-generated method stub

	}


