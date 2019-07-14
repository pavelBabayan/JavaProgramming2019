package day41_customclasses02;

public class Microwave {
	String brand;
	boolean isOn; //false. true => on, false => off
	
	public void turnOn() {
		if(isOn == true) {
			System.out.println(brand + " microwave is already ON");
		}else {
			System.out.println("Turing on "+brand + " microwave");
			isOn = true;
		}
	}
	
	public void turnOff() {
		if(isOn == false) { // already OFF
			System.out.println(brand + " microwave is already OFF");
		}else {
			System.out.println("Turing OFF "+brand + " microwave");
			isOn = false;
		}
	}
	
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating " + food);
		}else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}
	}
	
}








