package proj_ex0602;

public class Car2 extends Vehicle2 {
	
	//필드
	String modelName = "XM3";

	//메소드
	public void honk() {
		System.out.println("크락션 빵! 빵! 빵!");
		
		// 부모의 필드에 접근
		System.out.println("super필드: " + super.brand);
	}
	
	


}
