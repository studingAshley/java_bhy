package p0915_학생성적;

public class Product {
	String name;
	int price;
	int bonusPoint;
	
	Product()
	{
		//
	}
	
	@Override
	public String toString()
	{
		return String.format("%s,%d,%d", name,price,bonusPoint);
	}


}
