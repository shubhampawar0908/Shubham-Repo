package MethodAssignment;

import java.util.Scanner;

public class MiddleCharString {

	String getMiddleChar()
	{
		int a,length;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value: ");
		String Name=sc.next();
		if (Name.length() %2==0) {

			a=Name.length()/2-1;
			length=2;
		}
		else {
			a=Name.length()/2;
			length=1;
		}
		System.out.println("Middle number is: "+getMiddleChar());
		return(Name);

	}

	public static void main(String[] args) {
		MiddleCharString ms=new MiddleCharString();
		ms.getMiddleChar();

	}

}
