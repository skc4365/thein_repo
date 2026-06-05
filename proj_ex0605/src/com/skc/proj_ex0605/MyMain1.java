package com.skc.proj_ex0605;

public class MyMain1 {

	public static void main(String[] args) {
		
		Greeting greet = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("나는 인터페이스를 구현한 익명클래스야");
			}
			
		};
		greet.sayHello();
		
	
		
	}

}
