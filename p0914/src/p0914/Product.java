package p0914;

public class Product {
	String name;
	int price;
	int bonusPoint;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s, %d, %d", name, price, bonusPoint);
	}

}
