package OOPConcept;

public class Rectangle {

	String angle;
	String diagonals;
	String size;
	String interiorAngle;

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.angle="Each interior angle is equal to 90 degrees";
		r1.diagonals="The diagonals bisect each other";
		r1.size="3cm,5cm";
		r1.interiorAngle="The sum of all the interior angles is equal to 360 degrees";
		
		System.out.println("Angle Property: "+r1.angle);
		System.out.println("Rectangle Diagonals: "+r1.diagonals);
		System.out.println("Rectangle Size: "+r1.size);
		System.out.println("Interior Angle: "+r1.interiorAngle);
		

		// TODO Auto-generated method stub

	}

}
