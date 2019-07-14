package JavaInterviews;

import java.util.ArrayList;
import java.util.Arrays;

class z{
	public static void method1(int a) {
		
	}
	
}
class C extends z{
	
	public static void method1(double a) {
			
		}
	
}


public class Day01 {
	public static void main(String[] args) {
		
		/*
		 
		1. How do you combine two Strings?
				by suing concate method.
		
		2. What’s the differences between StringBuffer and StringBuilder? 
				What’s synchronization ?
				Stringbuffer & Stringbuilder: mutable version of sequences of characters
		
				StringBuffer: is synchronized (Thread-safe). 
						all the methods in Stringbuffer contains the specifier "Synchronize"
						
						disadvantages of Synchronization:
										1. Very Slow
										2. performance problem
				
		
		3. Tell me the differences between void and non-void methods?
				void : does not return any value.
				non-void: MUST return a Value.(Data type needs to be same with return-type)
		
		
		4. Can you explain what is 'public static void' ?
				public is access modifier. visible to the world
				static is specifier, any feature that has static , belongs to the class 
				void is a return type, the methopd does not retyurn any value			
		
		5. Briefly explain the differences between Array and ArrayList
					1. Array is fixed size, ArrayList is dynamic size
					2. ArrayList does not support primitive
					3. Array can be multi-dimensional 				
		
		6. What are the primitives and wrapper classes in java? Their differences
			primitives : byte, short, int, long, float, double, boolean, char
			wrapper classes: Byte, SHort, Integer, Long, Float, Double, Boolean, CHaracter
			
					differences: 
							1. Wrappers classes are object
							2. null can only be assigned to classes
							3. Wrapper class does have methods
							4. primitives does have default values
		
			default value of primitives:  byte, short, int, long ==> 0
											 float, doubl ==> 0.0;
											 boolean ==> false;
											 char ==> empty
											 
			default values of wrapper class: null
			
			
		7. Explain me the method overloading and method overriding? 
				Return type of overloaded method should be same or not?
				Can you overload and override the constant methods?
				
				overload: any method can be overload
						  same name different parameters
						  can be overload in same or sub class
						  return type does not have to be same
				
				Override: only instance methods can be override ( no final, no private)
							Must be override in sub class
							Access modifier needs to be same or more visible.
							return type and parameter needs to be same
							@override annotation can be applicable
		
		8.	differences between instance variable, class variables and local variables? 
					instance vairable belongs to the object.
					class variables (static variable): belongs to the class, can be called through class name
					local variable: declared within the method or blocks
				
		
		9.	what’s an instance method ? What is static method?
				instance method belongs to the object.
				static method belongs to the class. 
				(there is no object instances in static method, so in order to call non static we must create the object)
				
		10.	what’s constructor? Declaration ?
				special method.
				declaration:   AM  className(parameter), can only have AM, classname and parameters
				execution depends on the object
		
		11.	inner class VS outer class
				1. can Outer class be static?  no
				2. Can inner class be static?  Yes
				3. Can you create an object from the inner class?
						only if it's static
				4. can we have main method in inner class ?
						only if it's static
				 inner class can only be extended if it's static.
				
		
		12.	what are the blocks in java that you have used in your framework?
				blocks: static, instance, finally
		
		13.	difference between final and finally?
				final is a specifier:
						can only be applicable to methods, variables, and class
						
				finally: it's block, it must be decalared with try&catch blocks
		
		14. What is toString method in java?
				it's used to convert object to String
		
		15. Did you use Encapsulation in your framework? 
					How?  What’s the befits of using encapsulation ?
		 
		
		Your assignment:
	1. Create a return method that can remove duplicated values from an Integer ArrayList.
	  		Do not use Set interfaces.
	  		
	2. Create a method that can divide two numbers without using division operators and Math class.
		 break till: 6:15pm
		 
		 */
		
		StringBuffer strbuffer =new StringBuffer("Name");
			// convert StringBuffer to String:
		
			String str = strbuffer.toString();
			
			ArrayList< ArrayList<String> > list= new ArrayList<>();
				// list.add("Cybertek");
				ArrayList<String>  list1 = new ArrayList<>();
					list.add(list1);
		
		Integer num1 = 10;
				num1.toString();
				
			int num2 = 10;
		//		num2.toString();
			
			
		//	public int a=10;  local variables cannot have AM, and all specifier (except for final)

	}
	
	// in StringBuilder:
	public  void  Append(StringBuilder str) { 
		return;
	}
	
	// in StringBuffer: Synchronization:
	public synchronized void Append (StringBuffer str) {  }
	
	
	public static void result( int num1, int num2) {
		System.out.println(num1/num2);
	}

}
