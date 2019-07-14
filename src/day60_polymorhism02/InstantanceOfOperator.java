package day60_polymorhism02;

import day59_polymorphism.*;

public class InstantanceOfOperator {
	public static void main(String[] args) {
		Shape shape = new Square();
		//getClass().getName() method
		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());
		
		if(shape.getClass().getSimpleName().equals("Triangle") ) {
			System.out.println("It is a Triangle!");
		}else if(shape.getClass().getSimpleName().equals("Circle")){
			System.out.println("It is a Circle!");
		}else if(shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It is a Square!");
		}
		
		//Same check using instanceof operator
		
		System.out.println(shape instanceof Square);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);
		
		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Object);
		
		if(shape instanceof Triangle) {
			System.out.println("It is a Triangle!!");
			shape.draw();
		}else if(shape instanceof Circle) {
			System.out.println("It is a Circle!!");
			shape.draw();
		}else if(shape instanceof Square) {
			System.out.println("It is a Square!!");
			shape.draw();
		}
		
		Shape[] shapes = {new Triangle(), new Square(), new Circle(),
		          new Triangle(), new Square(), new Circle()};
		
		int circles = 0, squares = 0, triangles = 0;
		
		//using for each loop find our number of each type
		for(Shape sh : shapes) {
			if(sh instanceof Circle) {
				circles++;
			}else if(sh instanceof Square) {
				squares++;
			}else if(sh instanceof Triangle) {
				triangles++;
			}
		}
		
		System.out.println("circles: " + circles +"\n"+
							"squares: " + squares +"\n"+
							"triangles: " + triangles);
		
	}
}












