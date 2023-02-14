package methodAssignment3;

class Movie
{
	private String title;
	private String studio;
	private String rating;
	
	public Movie(String title, String studio, String rating)
	{
		this.title=title;
		this.studio=studio;
		this.rating=rating;
	}
	
	public Movie(String title,String Studio)
	{
		this.title=title;
		this.studio=studio;
		rating="PG";
	}
	
}

public class Ass2 {

	public static void main(String[] args) {
		
		Movie p=new Movie("Casino Royale","Eon Productions","PG-13");

	}

}
