package day42_customclasses_encapsulation;

public class Shoes {
	public String brand;
	double size;
	
	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}
	//read only
	public String getShoesData() {
		return brand + " | " + size;
	}
}
