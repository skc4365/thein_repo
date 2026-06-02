package proj_ex0602;

public class Ex2_Inheritance extends Vehicle {
	
	private String modelName = "Mustang;";

	//
	public static void main(String[] args) {

//		Vehicle vihicle = new Vehicle();
//		vihicle.honk();
		
		Ex2_Inheritance ex2_Inheritance1 = new Ex2_Inheritance();
		
		ex2_Inheritance1.honk();
		
		System.out.println(ex2_Inheritance1.modelName);
		System.out.println(ex2_Inheritance1.brand);

	}

}
