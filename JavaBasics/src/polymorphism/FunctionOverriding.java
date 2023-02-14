package polymorphism;

class Degree
{
	void getDegree()
	{
		System.out.println("I got degree");
	}
}

class Undergraduate extends Degree
{
	void getDegree()
	{
		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree
{
	void getDegree()
	{
		System.out.println("I am a Postgraduate");
	}
}
public class FunctionOverriding {

	public static void main(String[] args) {

		
		Degree s=new Degree();
		s.getDegree();
		s=new Undergraduate();
		s.getDegree();
		s=new Postgraduate();
		s.getDegree();
	}

}
