package p0914;

public class Audio extends Product{
	String speakerPower;
	
	Audio()
	{
		name = "Bridge Audio";
		price = 300000;
		bonusPoint = price/100;
		speakerPower = "30W";
	}
	
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString()+String.format(", %s", speakerPower);
	}


}
