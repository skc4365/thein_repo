package com.skc;

public class Ex3_cal {

	public static void main(String[] args) {
		
		/*
		 * // 클래스를 사용하여, 사칙연산을 담당하는 계산기를 작성합시다.
		 * 
		 * 1. 계산기 클래스 정의하기
		 * 2. 필요한 기능(+, -,*, /) 정의하기
		 * 3. 결과값 출력하기
		 * 
		 */		
		
		// num1변수, num2변수
//		int num1;
//		int num2;
//		String strResult;
		int result;
		
//		1. 계산기 클래스 정의하기
		Calcu calcu = new Calcu();
		
		
//		2. 필요한 기능(+, -,*, /) 정의하기
//		// 덧셈
//		calcu.addCal(100,200);
//		// 뺄셈
//		calcu.subCal(100,200);
//		// 곱셈
//		calcu.mulCal(100,200);
//		// 나눗셈
//		calcu.divCal(100,200);
//		// 나머지
//		calcu.remCal(100,200);
		
		System.out.println("============");
		
//		3. 결과값을 main에서 받아서 출력하기
		// result에 결과값을 받아서 출력하기
		// 덧셈
		result = calcu.addCal2(100,200);
		System.out.println("덧셈 + 리턴값은: " + result);
		// 뺄셈
		result = calcu.subCal2(100,200);
		System.out.println("뺄셈 - 리턴값은: " + result);
		// 곱셈
		result = calcu.mulCal2(100,200);
		System.out.println("곱셈 * 리턴값은: " + result);
		// 나눗셈
		result = calcu.divCal2(100,200);
		System.out.println("나눗셈 / 리턴값은: " + result);
		
		
	}
}







