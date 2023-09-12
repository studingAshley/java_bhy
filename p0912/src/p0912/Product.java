package p0912;

public class Product {
	static int count = 0;
	int serialNo;
	String pName;
	int price;


	{
		count++;
		serialNo = count;
	}
	Product()
	{

	}
	
	Product(String pName)
	{
		this.pName = pName;
	}
	
	Product(String pName, int price)
	{

		this.pName = pName;
		this.price = price;
	}

}
