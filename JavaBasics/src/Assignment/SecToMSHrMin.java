package Assignment;

import java.util.Scanner;

public class SecToMSHrMin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
	    	int seconds = in.nextInt();
        int S = seconds * 1000;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
		System.out.print("\n");
		// TODO Auto-generated method stub

	}

}
