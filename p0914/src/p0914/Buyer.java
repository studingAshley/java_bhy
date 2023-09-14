package p0914;

import java.util.ArrayList;

public class Buyer {
	String id;
	String name;
	int money =10000000;
	int bonusPoint = 0 ;
	
	ArrayList cart = new ArrayList();
	
	
	Buyer()
	{

	}
	
	Buyer(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void buy(Product p)
	{
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		cart.add(p);
//cart[count++] = p;
	}

}
