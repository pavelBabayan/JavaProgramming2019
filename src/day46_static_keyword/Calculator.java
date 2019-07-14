package day46_static_keyword;

public class Calculator {
	
    double result;
	
	public static double plus(double num1, double num2) {
		//result = num1 + num2; will not work
		return num1 + num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
}
