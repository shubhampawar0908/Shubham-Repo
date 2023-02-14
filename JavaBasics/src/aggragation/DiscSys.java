package aggragation;

class Customer
{
	String name;
	boolean member;
	String memberType;
	
	
	public Customer(String name)
	{
		this.name=name;
	   
	}

	public String getName() {
		return name;
	}

	
	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	
}

class Visit
{
	String date;
	double serviceExpense;
	double productExpense;
	
	Customer c;
	
	public Visit(String name,String date)
	{
		this.c.name=name;
		this.date=date;
		
	}

	public String getDate() {
		return date;
	}

	

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	
}

class DiscountRate
{
	static double serviceDiscountPremium=0.2;
	static double serviceDiscountGold=0.15;
	static double serviceDiscountSilver=0.1;
	static double productDiscountPremium=0.1;
	static double productDiscountGold=0.1;
	static double productDiscountSilver=0.1;
	
	double getServiceDiscountRate()
	{
		return 0.0;
		
	}
	double getProductDiscountRate()
	{
		return 0.0;
		
	}
}

public class DiscSys {

	public static void main(String[] args) {
       
		
		
	}

}
