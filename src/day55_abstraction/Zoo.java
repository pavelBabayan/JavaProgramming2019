package day55_abstraction;

public class Zoo {
	public static void main(String[] args) {
		// Animal animal = new Animal(); Cannot instantiate the type Animal
		Cat fluffy = new Cat("Fluffy");
		fluffy.speak();
		Dog poohchi = new Dog("Rex");
		poohchi.setName("Poohchi");
		poohchi.speak();
		poohchi.eat();

	}
}
