package com.skc2.proj_ex0605;

class MyMain2 {

	public static void main(String[] args) {

//		Level myVar = Level.MEDIUM;
//		System.out.println(myVar);
//
//		switch (myVar) {
//		case LOW:
//			System.out.println("LOW 커피 로스팅 주문");
//			break;
//		case MEDIUM:
//			System.out.println("MEDIUM 커피 로스팅 주문");
//			break;
//		case HIGH:
//			System.out.println("HIGH 커피 로스팅 주문");
//			break;
//		}
//		System.out.println("====Level======");
//		
//		for(Level v : Level.values()) {
//			System.out.println(v);
//		}
		
		System.out.println("====Level2======");
		
		Level2 myVar2 = Level2.MEDIUM;
		System.out.println(myVar2);
		
		System.out.println("----------------");
		
		for(Level2  v2 : Level2.values()) {
			System.out.println(v2 + ": " + v2.getDescription());
		}
		
	}

}
