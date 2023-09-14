package p0914;

public class Computer extends Product {
	String cpu;
	
	Computer()
	{
		name = "LG Computer";
		price = 2000000;
		bonusPoint = price/100;
		cpu = "i5-1240p";
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+String.format(", %s", cpu);
	}
}
