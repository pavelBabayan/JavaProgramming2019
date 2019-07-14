package day55_abstraction;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("meooooooooow....");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " eats");

	}

	@Override
	public void produceAMilk() {
		// TODO Auto-generated method stub

	}

}
