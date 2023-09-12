package p0911;

public class Card {
	
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
	void cardPrint() 
	{
		System.out.printf("kind : %s, number : %d \n", kind, number);
	}

}

