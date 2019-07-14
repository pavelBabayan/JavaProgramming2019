package day55_abstraction;

public abstract class Animal{
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void speak(); // so we cannot have abstract methods in regular classes

	public abstract void eat();

	// dog speaks: woof woof
	// cat speaks: meooooooooow....
	// pig speaks: oink oink'
	// we can have regular methods (non-abstract)
	// in the abstract class
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
