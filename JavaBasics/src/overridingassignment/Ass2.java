package overridingassignment;

class Bank
{
	
	String name="Shubham";
	void getBalance()
	{
		System.out.println("0");
	}
}

class BankA extends Bank
{
	String name="Ruturaj";
	void getBalance()
	{
		System.out.println("$1000 money deposited in BankA");
		
	}
}

class BankB extends Bank
{
	void getBalance()
	{
		System.out.println("$1500 money deposited in BankB");
		
	}
}

class BankC extends Bank
{
	void getBalance()
	{
		System.out.println("$2000 money deposited in BankC");
		
	}
}
public class Ass2 {

	public static void main(String[] args) {

		Bank b=new Bank();
		b=new BankA();
	    System.out.println(b.name);
	    
	
		b.getBalance();
		b=new BankB();
		b.getBalance();
		b=new BankC();
		b.getBalance();
		
	}

}
