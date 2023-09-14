package p0914;

public class Tv extends Product{
	String size;
	
	Tv()
	{
		name = "Samsung TV";
		price= 1000000;
		bonusPoint = price/100;
		size = "70inch";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+String.format(", %s", size);
	}

}
