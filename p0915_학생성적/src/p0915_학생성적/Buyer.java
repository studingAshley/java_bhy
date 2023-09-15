package p0915_학생성적;

import java.util.ArrayList;

public class Buyer {
	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;
	
	ArrayList cart = new ArrayList();
	
	Buyer()
	{
		id = "announymous";
		name = "announymous";
		
	}
	
	Buyer(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	boolean addCart(Product p)
	{
		if(money >= p.price)
		{
			money -= p.price;
			cart.add(p);	
			return true;
		}
		else
		{
			System.out.println("[알림] 잔액이 부족합니다.");
			return false;
		}
	}
	
	void balance()
	{
		System.out.printf("%s님의 남은 잔액 : %,d원\n",name,money);
	}
	int getMoney()
	{
		return money;
	}
	void addMoney(int m)
	{
		money += m;
		System.out.printf("충전 후 잔액 : %,d원\n",money);
	}
	
	String getName()
	{
		return name;
	}
	
	void printList()
	{
		System.out.println("[ 구매 목록 ]");
		for(int i = 0 ; i < cart.size() ; i ++)
		{
			System.out.println((i+1)+". "+ ((Product)cart.get(i)).name);
		}
	}

}
