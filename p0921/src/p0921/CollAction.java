package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class CollAction { 

	ArrayList<Card> cardList = new ArrayList<Card>();	
	
	ArrayList<StuScore> ssList = new ArrayList<StuScore>();
	
	ArrayList<Car> list2 = new ArrayList<Car>();
	
	HashMap<String,Object> map = new HashMap();
	
	HashMap<String,Object> carAndScore()
	{
		list2.add(new Car("white",5));
		list2.add(new Car("red",4));
		list2.add(new Car("black",5));
		
		ssList.add(new StuScore("홍길동",100,100,99));
		ssList.add(new StuScore("유관순",80,80,89));
		ssList.add(new StuScore("이순신",90,90,91));
		
		map.put("list", ssList);
		map.put("list2",list2 );
		return map;
	}
	
	ArrayList<Car> carAll()
	{
		list2.add(new Car("white",5));
		list2.add(new Car("red",4));
		list2.add(new Car("black",5));
		
		return list2;
	}
	
	ArrayList<StuScore> scoreAll()
	{
		ssList.add(new StuScore("홍길동",100,100,99));
		ssList.add(new StuScore("유관순",80,80,89));
		ssList.add(new StuScore("이순신",90,90,91));
		
		return ssList;
	}
	
	
	
	void cardAll()
	{
		//1-13 , spade heart clover diamond 52장 카드 생성
		String[] kind = {"Spade","Heart","Diamond","Clover"};
		
		for(int i = 0 ; i < kind.length ; i++)
		{
			for(int j = 0 ; j < 13 ; j++)
			{
				cardList.add(new Card(j+1, kind[i]));
			}
		}
		
//		for(int i = 0 ; i < cardList.size() ; i++)
//		{
//			System.out.println(cardList.get(i).getNumber()+","+cardList.get(i).getKind());
//		}

	}
	
	CollAction()
	{
	//	c.setNumber(1);
	}

	ArrayList<Card> setInsert()
	{
		cardAll();
		
		return cardList;
	}
}
