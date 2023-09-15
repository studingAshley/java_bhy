package p0914;

import java.util.ArrayList;

public class Buyer {
	String id;
	String name;
	private int money =10000000;
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
	
	boolean buy(Product p)
	{
		if(money >= p.price)
		{
			money = money - p.price;
			bonusPoint = bonusPoint + p.bonusPoint;
			cart.add(p);
			
			return true;
		}
		else
		{
			System.out.println("[알림] 잔액이 부족합니다");
			return false;
		}
//cart[count++] = p;
	}
	
	void printlist()
	{
		for(int i = 0 ; i < cart.size() ; i++)
		{
			System.out.printf("%s/", ((Product)cart.get(i)).name);
		}
		System.out.println();System.out.println();
	}
	
	int getmoney()
	{
		return money;
	}
	
	void addmoney(int coin)
	{
		this.money += coin;
	}

}
