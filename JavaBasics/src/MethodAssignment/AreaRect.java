package MethodAssignment;

public class AreaRect {
	
	int lenght;
	int breadth;
     
	
	public AreaRect(int lenght,int breadth)
	{
		this.lenght=lenght;
		this.breadth=breadth;
	}
	public int calculateArea()
	{
		return this.lenght*this.breadth;
	    	
	}
	
	

	public static void main(String[] args) {
               
		AreaRect p=new AreaRect(10,5);
		 System.out.println(p.calculateArea());
	}

}
