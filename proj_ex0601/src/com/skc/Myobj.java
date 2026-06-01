package com.skc;

//----- 메소드 -----
public class Myobj {

	int x = 5;
	String name = "선경";
	
	// void meMethod()
	public void meMethod() {
		System.out.println("meMethod 실행됨");
	}

	// void meMethod(int i)
	public void meMethod(int i) {
		
		// 문제: 오브젝트의 이름을 전달받아서 출력.
		// ex1
		System.out.println("meMethod 실행됨");
		System.out.println(i);
		
		// ex2
		System.out.println("myobj_" + i);
		
		// ex3
		String str1 = "myobj_";
		System.out.println(str1 + i);
		
		// ex4
		String result = "myobj_" + i;
		System.out.println(result);
		
		// ex5
		String result2 = str1 + i;
		System.out.println(result2);


		
	}

}
