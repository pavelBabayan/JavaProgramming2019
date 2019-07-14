package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare int variables num1, num2, num3
		int num1, num2, num3;
		
		//assign 100 to num1
		num1 = 100;
		//assign value of num1 to num2
		num2 = num1;
		//Print num1 and num2 values in separate lines
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num3 = num1;
		num1 = num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//declare apples and assign 25
		int apples = 25;
		//declare kiwis and assign value of apples to it
		int kiwis = apples;
		//declare mangoes and 55
		int mangoes = 55;
		//assign value of mangoes to kiwis
		kiwis = mangoes;
		
		System.out.println(apples); //25
		System.out.println(kiwis);  //55
		System.out.println(mangoes);//55
		
		
	}
}


