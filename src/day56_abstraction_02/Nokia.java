package day56_abstraction_02;

public class Nokia extends MobilePhone{

	@Override
	public void text(String message) {
		System.out.println("Nokia sending msg: " + message);
	}

	@Override
	public void call() {
		System.out.println("Nokia is calling");	
	}

}
