package inheritance;

class Parent12
{
	int num;
	public Parent12()
	{
		System.out.println("hi");
	}
	
	public Parent12(String msg)
	{
		System.out.println(msg);
	}
	
	void showh()
	{
		System.out.println(num);
	}
}

class Child12 extends Parent12
{
	int sum;
	public Child12(int sum)
	{
	
		System.out.println("hey");
	}
	
	void show()
	{
		System.out.println(this.sum);
	}
}

public class ConsDemo {

	public static void main(String[] args) {
		
		Child12 c=new Child12(8);
		
		
		
		
		
	
	}

}
