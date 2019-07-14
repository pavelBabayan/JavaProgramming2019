package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {

	public static void main(String[] args) {
		Scanner murodil = new Scanner(System.in);
		double num1, num2, result;
		String operator;
		
		System.out.println("Enter first number");
		num1 = murodil.nextDouble();
		System.out.println("Enter second number");
		num2 = murodil.nextDouble();

		System.out.println("Select operator: \"+\", \"-\", \"*\", \"/\"");
		operator = murodil.next();
		murodil.close();

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:		
			System.out.println("Invalid operator");
			return;
		}

		System.out.println("Result " + result);
	}
}
