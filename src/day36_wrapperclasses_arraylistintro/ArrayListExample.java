package day36_wrapperclasses_arraylistintro;

import java.util.*; 
//import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//declare arraylist called languages
		ArrayList<String> languages = new ArrayList<>();
		//add values
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijani");
		languages.add("Ukranian");
		//languages.add(true);
		System.out.println("Number of values: " + languages.size());
		languages.add("Turkish");
		System.out.println("Number of values: " + languages.size());
		
		//remove java
		languages.remove(0);
		System.out.println("Number of values: " + languages.size());
		
		System.out.println(languages.toString());

	}
}






