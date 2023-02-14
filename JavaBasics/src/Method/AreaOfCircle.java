package Method;



public class AreaOfCircle {
	
	float area (float a, float r)
	{
	  return(a*r);	
	}
	
	void area () {
		System.out.println("The area of Circle is 240");
	}

	public static void main(String[] args) {
		
		AreaOfCircle m= new AreaOfCircle ();
		
		
		System.out.println(m.area(3.14f,12.0f));
		
        m.area();
	}

}
