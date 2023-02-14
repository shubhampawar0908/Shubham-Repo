package Array;

import java.util.Scanner;

public class ScalarMatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Sc_Mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Scanner sc = new Scanner(System.in);
		
		int i, j, num;
		
		System.out.println("\nPlease Enter the Multiplication Value :  ");
		num = sc.nextInt();
		
		System.out.println("\nMatrix after Scalar Multiplication are :");
		for(i = 0; i < Sc_Mat.length ; i++)
		{
			for(j = 0; j < Sc_Mat[0].length; j++)
			{
				System.out.format("%d \t", (num * Sc_Mat[i][j]));
			}
			System.out.print("\n");
		}
	}

}
