package CoditionalStatements;

public class AgeGroup {

	public static void main(String[] args) {
		
		int age=62;
		
		if(age<=0)
		{
			System.out.println("Invalid age");
		}
		
		else if(age<=12)
		{
			System.out.println("The age group is Child");
		}
		else if(age<=18)
		{
			System.out.println("The age group is Teen");
		}
		
		else if(age<=40)
		{
			System.out.println("The age group is Youth");
		}
		
		else if(age<=60)
		{
			System.out.println("The age group is Adult");
		}
		
		else
		{
			System.out.println("The age group is Senior citizen");
		}
		
		
		// TODO Auto-generated method stub

	}

}
