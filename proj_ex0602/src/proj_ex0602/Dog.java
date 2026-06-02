package proj_ex0602;

//자식클래스
public class Dog extends Animal {
	
	// 재정의
	public void animalSound() {
		System.out.println("멍멍머");
		
		// 부모의 메소드도 사용하기
		super.animalSound();
	}

}
