package overridingassignment;

class A
{
	int i;
	
	void printNum(int i)
	{
		this.i=i;
		System.out.println("The value of i is:"+this.i);
	}
}

class B extends A
{
	int j;
	
	void printNum(int j)
	{
		
		this.j=j;
		System.out.println("The value of j is:"+this.j);
	}
	
}
public class Ass3 {

	public static void main(String[] args) {

		
		
		A p=new A();
		p.printNum(5);
		p=new B();
		p.printNum(7);
		

	}

}
