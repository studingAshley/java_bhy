package p0921;

import java.util.ArrayList;

public class ColAction2 {
	
	ArrayList<Card> cardList = new ArrayList<Card>();
	
	ColAction2(){};
	
	ArrayList<Card>  CardAll()
	{
		String[] kind = {"Spade","Heart","Diamond","Clover"};
		for(int i = 0 ; i < kind.length ; i++)
		{
			for(int j = 0 ; j < 13 ; j++)
			{
				cardList.add(new Card(j+1,kind[i]));
			}
		}
		
		return cardList;
	}

}
