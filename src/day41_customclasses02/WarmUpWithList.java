package day41_customclasses02;
import java.util.*;

import day42_customclasses_encapsulation.Shoes;

public class WarmUpWithList {
	
	public static void main(String[] args) {
		
		Shoes shoes = new Shoes();
		shoes.brand = "Aldo";
		//shoes.size = 10.0; not visible
		
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		System.out.println(doubleTheList(myList));
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);
	}
	/*
	 * [5,2]
	 * [10,4]
	 */
	public static List<Integer> doubleTheList(List<Integer> nums) {
		for(int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		return nums;
	}
	
}
