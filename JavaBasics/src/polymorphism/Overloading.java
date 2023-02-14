package polymorphism;

public class Overloading {
	
   static final void add(float num1, float num2)
	{
		System.out.println("Addition of two number is:"+(num1+num2));
	}
	
	static final void add(int num1, int num2)
	{
		System.out.println("Addition of two number is:"+(num1+num2));
	}

	 static final void add(double num1, double num2)
	{
		System.out.println("Addition of two number is:"+(num1+num2));
	}

	public static void main(String[] args) {
		
		
		Overloading s=new Overloading();
		
		s.add(3.1f, 4.8f);
		s.add(12, 8);
		s.add(5, 5);
		

	}

}
