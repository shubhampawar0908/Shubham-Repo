package aggragation;

class Country
{
	String name;
	SportPerson sp;
	
	public Country(String name,SportPerson sp)
	{
		this.name=name;
		this.sp=sp;
		
	}
	
	void display1()
	{
		
		System.out.println("Country name is:"+this.name);
		System.out.println("Player name is:"+this.sp.playerName);
		System.out.println("Sport name is:"+this.sp.sportName);
		System.out.println("Team name is:"+this.sp.teamName);
		System.out.println("Captain name is:"+this.sp.captainName);
		System.out.println("Review:"+this.sp.review);
	
		System.out.println(" ");
		
	}
	
}

class SportPerson

{
	String playerName;
	String sportName;
	String teamName;
	String captainName;
	String review;
	
	public SportPerson(String playerName,String sportName,String teamName,String captainName,String review)
	{
		this.playerName=playerName;
		this.sportName=sportName;
		this.teamName=teamName;
		this.captainName=captainName;
		this.review=review;
	}
	
	
}

public class Aggregation1 {

	public static void main(String[] args) {
		
		SportPerson s=new SportPerson("Sachin Tendulkar", "Cricket", "India", "Rohit Sharma","He is good player");
		
	   
	     
	     Country p=new Country("India",s);
	     p.display1();
	    

	     
	   SportPerson ps=new SportPerson("Lionel Messi", "Football", "Argentina", "Maradona","He is good player");
        
	     Country c=new Country("Argentina",ps);
	     
	     c.display1();
         
	     
	}

}
