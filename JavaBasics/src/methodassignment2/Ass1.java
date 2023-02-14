package methodassignment2;

import java.util.Scanner;

class Area{

int length;
int breadth;

public void setDim(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
}

public int getArea()
{
	return this.length*this.breadth;
}
}


public class Ass1 {

	public static void main(String[] args) {
		 
		Area a=new Area();
		
	    Scanner p=new Scanner(System.in);
	    System.out.println("Enter Lenegth and breadth");
	    int length=p.nextInt();
	    int breadth=p.nextInt();
	    a.setDim(length,breadth);
	    System.out.println(a.getArea());
		
	}

}
