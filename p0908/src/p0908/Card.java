package p0908;

public class Card {

	String kind;
	int number;
	
	static int width = 100;
	static int height=250;
	Card()
	{
	
	}
	
	Card(String kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}

	void print_data()
	{
		System.out.println(this.kind+" "+this.number);
	}
}
