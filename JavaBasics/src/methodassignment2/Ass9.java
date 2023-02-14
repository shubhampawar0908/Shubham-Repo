package methodassignment2;

class Complex

   
{
	 int real;
	 int img;
	 
	 public Complex(int real,int img)
	 {
		 this.real=real;
		 this.img=img;
	 }
	 
	 public void sumComplex()
	 {
		int realNo=this.real+this.real;
		int imgNo=this.img+this.img;
		
		System.out.println("The Addition of Two no is:"+realNo+"+"+imgNo+"i");
	 }

}

public class Ass9 {

	public static void main(String[] args) {
		
		Complex  c= new Complex(4,6);
		c.sumComplex();
		
	
		
		

	}

}
