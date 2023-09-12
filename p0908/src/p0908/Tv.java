package p0908;

public class Tv {
	
	String color;
	boolean power;
	int channel;
	
	Tv()
	{
	
	}
	
	void power()
	{
		power =! power;
	}
	
	void channelUp()
	{
		channel++;
	}
	
	void channelDown()
	{
		channel--;
	}

}
