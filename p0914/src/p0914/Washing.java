package p0914;

public class Washing extends Product {

	String capacity;
	
	Washing()
	{
		name = "Grande rondry";
		price = 550000;
		bonusPoint = price/100;
		capacity = "23Kg";
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+String.format(", %s", capacity);
	}
}
