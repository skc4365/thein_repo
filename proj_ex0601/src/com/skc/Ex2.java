package com.skc;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// new 생성자를 부르는 키워드
		MyCar myCar = new MyCar();

		// 오브젝트가 초기화될때, 2값을 사용한다.
		MyCar myCar2 = new MyCar(4);

		// 오브젝트가 초기화될때, 1969, "Mustang"값을 사용한다.
		// 매개값 = 1969, "Mustang" 있다.
		MyCar myCar3 = new MyCar(1969, "Mustang");
		
		
		System.out.println(myCar.num1);
		System.out.println(myCar2.num1);
		myCar3.num1 = 5;
		System.out.println(myCar3.num1);
		
	}

}
