package day43_encapsulation_constructor;

public class TeslaDealer {
	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		tesla.setModel("Model Y");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: " + tesla.getModel());
		System.out.println("range: " + tesla.getRange());
		System.out.println("0to60: " + tesla.getZeroTo60());
		System.out.println("price: " + tesla.getPrice());
		System.out.println("selfDriving: " + tesla.isSelfDriving());
		
		System.out.println(tesla); //automatically calling toString method
		System.out.println(tesla.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		//tesla , myTesla
		if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + tesla.getZeroTo60());
		}
		
		buy(myTesla);
		buy(tesla);
		System.out.println( testDrive("Model S") );
		Tesla testCar = testDrive("Model 3");
		System.out.println(testCar.toString());
	} //main method
	
	public static Tesla testDrive(String model) {
		System.out.println("-Hi, I would like to test drive - " + model);
		System.out.println("-Sure, let me build the object and return it, momentarily!");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing: " + car.toString());
	}
	
}




