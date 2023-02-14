package OOPConcept;

public class Mobile {

	int modelNo;
	String modelName;
	String color;
	String size;
	int ram;
	int rom;
	

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.modelNo=21546;
		m1.modelName="OnePlus";
		Mobile m2=new Mobile();
		m2.color="LakeBlue";
		m2.size="5.2inches";
		Mobile m3=new Mobile();
		m3.ram=12;
		m3.rom=256;
		
		System.out.println("Model No="+m1.modelNo);
		System.out.println("Model Name="+m1.modelName);
		System.out.println("Model color="+m2.color);
		System.out.println("Model size="+m2.size);
		System.out.println("RAM ="+m3.ram);
		System.out.println("ROM ="+m3.rom);
		// TODO Auto-generated method stub

	}

}
