package chapter06_separationofconcernsbasic.bmi;

public class BMI {
	/*
	 * @param heightMeter 身長(m)
	 * @param weightKg 体重(kg)
	 * @return bmi
	 */
	double bmi(double heightMeter, double weightKg) {
		return weightKg / (heightMeter * heightMeter);
	}
}
