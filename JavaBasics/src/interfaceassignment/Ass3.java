package interfaceassignment;

abstract class Marks{
	abstract double getPercentage();
	
   
}

class SA extends Marks
{
	double a;
	double b,c;
   public SA(double a,double b,double c)
   {
	   this.a=a;
	   this.b=b;
	   this.c=c;
   }
	
	double getPercentage() {
		
		double per=(((this.a+this.b+this.c)/300)*100);
		return per;
	}
	
}
class SB extends Marks
{
	double a;
	double b,c,d;
   public SB(double a,double b,double c,double d)
   {
	   this.a=a;
	   this.b=b;
	   this.c=c;
	   this.d=d;
   }
	
	double getPercentage() {
		double per=(((this.a+this.b+this.c+this.d)/400)*100);
		return per;
				
	}
	
}

public class Ass3 {

	public static void main(String[] args) {
		SA s=new SA(50,50,50);
		System.out.println("Percentage of student A:"+s.getPercentage());

		SB b=new SB(87,98,79,89);
		System.out.println("Percentage of student A:"+b.getPercentage());


	}


}
