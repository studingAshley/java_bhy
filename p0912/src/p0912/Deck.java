package p0912;

public class Deck {

	Card[] card = new Card[52];
	String[] name = {"Spade","Heart","Diamond","Clover"};
	
	Deck()
	{
		for(int i = 0 ; i < card.length ; i ++)
		{
			card[i] = new Card();
			card[i].kind = name[i/13];
			card[i].number = (i%13) + 1;
		}
	

	}
	
	Card pick(int num)
	{
		if(num > 52)
		{
			System.out.println("Wrong number");
			return new Card("Wrong",0);
		}
		return card[num];
	}
	
	Card pick()
	{
		int r = (int)(Math.random()*52);
		return card[r];
	}
	
	void printCard()
	{
		for(int i = 0 ; i < card.length ; i++)
		{
			System.out.println(card[i]);
		}
	}
	
	void shuffle()
	{
		for(int i = 0 ; i < 1000 ; i++)
		{
			int r = (int)(Math.random()*52);
			Card temp  = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
	}
	
}
