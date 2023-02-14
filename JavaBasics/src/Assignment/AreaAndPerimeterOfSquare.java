package Assignment;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter side of square : ");
            double side = scanner.nextDouble();         
                 
            
            double area = side * side;
           
            System.out.printf(" Area of square is : %4.2f",area);
             
           
            double Perimeter = 4 * side;
        
            System.out.printf("\n Perimeter of square is : %4.2f",Perimeter);
        }
		

	}

}
