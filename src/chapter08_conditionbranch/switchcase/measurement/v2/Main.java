package chapter08_conditionbranch.switchcase.measurement.v2;

public class Main {

	public static void main(String[] args) {
		Measurement measurement = new Rectangle(20, 25);
		System.out.println(measurement.area());
		measurement = new Circle(10);
		System.out.println(measurement.area());
		
		Rectangle rectangle = new Rectangle(8, 12);
		showArea(rectangle);
		
	}
	
	static void showArea(Measurement measurement) {
		System.out.println(measurement.area());
	}

}
