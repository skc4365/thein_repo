package proj_ex0602;

public class Ex3_Inheritance {
	public static void main(String[] args) {
		
		Car2 car2 = new Car2();
		// 크락션 울리기
		car2.honk();
		
		System.out.println(car2.modelName);
		
		
		// 상속: Car2 extends Vehicle2
		System.out.println(car2.brand);
	}

}
