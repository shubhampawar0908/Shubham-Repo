package OOPConcept;
class Demo

{
       public static void main(String[] args) {
		
            System.out.println("HEy");
	 }
            public static void main(String[] args,int a) {
	
             System.out.println("Hiiii");
         }


}

public class Animal {

	String aName;
	 String aColor;
	 int aNo;
	 int aWeight;

	public static void main(String[] args) {
//		Animal a1=new Animal();
//		a1.aName="Tiger";
//		a1.aColor="YELLOW-GOLD";
//		a1.aNo=10500;
//		a1.aWeight=195;
//		
//		System.out.println("Name of Animal: "+a1.aName);
//		System.out.println("Color of Animal: "+a1.aColor);
//		System.out.println("No. of Lions left: "+a1.aNo);
//		System.out.println("Avg Weight of male Lion: "+a1.aWeight);
             
		Demo d=new Demo();
		d.main(args);
		d.main(null, 0);

	}

}
