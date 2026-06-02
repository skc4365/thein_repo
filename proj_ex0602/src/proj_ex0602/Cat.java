package proj_ex0602;

public class Cat extends Animal {

	public void animalColor() {
		System.out.println("치즈냐이 털 색상");
	}

	public void animalColorFlag(boolean flag) {

		if (flag) {
			//flag가 true일때
			super.animalColor();
		} else {
			//flag가 false일때
			animalColor();
		}
	}

}
