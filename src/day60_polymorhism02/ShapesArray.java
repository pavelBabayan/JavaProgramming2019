package day60_polymorhism02;

//import day59_polymorphism.Shape;
//import day59_polymorphism.Triangle;
import day59_polymorphism.*;
import java.util.*;

public class ShapesArray {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.draw(); //overriden version of draw is called
		
		System.out.println(shape.getClass().getName());
		
		Shape[] shapes = {new Triangle(), new Square(), new Circle(),
				          new Triangle(), new Square(), new Circle()};
		
		Shape[] shapes2 = new Shape[3];
		shapes2[0] = new Triangle();
		shapes2[1] = new Square();
		shapes2[2] = new Circle();
		
		shapes[0].draw();
		shapes2[2].draw();
		
		System.out.println("#### FOR EACH LOOP ####");
		
		for(Shape sh : shapes) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}
		// create a list of Shape shapesList and add 5 different child objects
		
		List<Shape> shapesList = new ArrayList<>();
		ArrayList<Shape> shapesArrayList = new ArrayList<>();
		
		shapesList.add(new Triangle());
		Shape newShape = new Square();
		shapesList.add(newShape);
		shapesList.add(new Circle());
		shapesList.add(new Triangle());
		shapesList.add(new Circle());
		
		//draw first shape
		shapesList.get(0).draw();
		Shape someShape = shapesList.get(1);
		someShape.draw();
		
		System.out.println("####  FOR EACH WITH LIST OF SHAPES");
		
		for(Shape shapeItem: shapesList) {
			System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
			shapeItem.draw();
		}
		
		System.out.println("#### FOR LOOP WITH LIST OF SHAPES");
		
		for(int i = 0; i < shapesList.size(); i++) {
			Shape tempSh = shapesList.get(i);
			System.out.println(tempSh.getClass().getSimpleName().toUpperCase());
			tempSh.draw();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
