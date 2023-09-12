package p0912;

public class Car {

	String color;
	String gearType;
	int door;
	
	Car()
	{
//		color = "white";
//		gearType = "auto";
//		door = 5;
		this("white","auto",5);
	}
	
	Car(String color, String gearType, int door)
	{
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c)
	{
		this(c.color, c.gearType, c.door);
		
	}
}
