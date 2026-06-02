package proj_ex0602;

public class Car {
	int modelYear;
	String modelName;

	public Car() {
		System.out.println("기본생성자");
	}

//	   new Car(       "붕붕이")
	public Car(String modelName) {
//		this(2026, modelName);

		System.out.println(modelName);
		this.modelName = modelName;
		System.out.println("this.modelName: " + this.modelName);
	}

//     new Car(         1969,        "현대")
	public Car(int modelYear, String modelName) {
		System.out.println(modelYear);
		System.out.println(modelName);

//		this.modelYear = modelYear;
//		this.modelName = modelName;
		System.out.println("this.modelYear: " + this.modelYear);
		System.out.println("this.modelName: " + this.modelName);
	}

	public void printInfo() {
		System.out.println(modelYear + " -- " + modelName);
	}

	
}
