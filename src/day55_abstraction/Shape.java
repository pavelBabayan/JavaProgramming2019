package day55_abstraction;
//1,Create a Shape abstract class

//
//2,create instance fields: name, area (double);
//
//3,create 2 abstract methods as below :
//calculateArea() return double, no arg
//draw() void 
//4 ,create one constructor that sets name-value
//5.1,create no arg constructor and call super class's 
//one arg constructor for Circle add 1 arg to set radius
//for Circle add 1 arg to set radius,Triangle 3 args 
//set length
public abstract class Shape {
	String name;
	double area;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();
	public abstract void draw();

}
