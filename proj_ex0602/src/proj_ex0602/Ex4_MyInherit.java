package proj_ex0602;

public class Ex4_MyInherit {

	public static void main(String[] args) {

		Pig pig = new Pig();
		Dog dog = new Dog();

		// 다형성 테스트
		pig.animalSound();
		dog.animalSound();
		System.out.println("==============");

//		----- 테스트 -----
//		1. 고양이cat 오브젝트 생성.
		Cat cat = new Cat();
//		2. 동물들의 털 색상color출력
		cat.animalColorFlag(true);
//		3. 치즈냥이 털 색상출력
		cat.animalColorFlag(false);

	}

}
