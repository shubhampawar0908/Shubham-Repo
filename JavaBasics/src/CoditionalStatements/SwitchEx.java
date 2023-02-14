package CoditionalStatements;

public class SwitchEx {

	public static void main(String[] args) {
		String day="Saturday";
		switch(day)
		{
		case "Saturday","Sunday":System.out.println("I wake Up at 9am");
		break;
		
		case "mon","Tue","Wed","Thurs","Fri":System.out.println("I wake Up at 7am");
		break;
		
		default:System.out.println("Invalid day");
		
				}
		// TODO Auto-generated method stub

	}

}
