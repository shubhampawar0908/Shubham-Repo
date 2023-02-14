package Assignment;

public class SecondsToHourAndMInutes {

	public static void main(String[] args) {
		
		int seconds = 86399;
        System.out.println("Input seconds: "+seconds);
	    	
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
		System.out.print("\n");
		// TODO Auto-generated method stub

	}

}
