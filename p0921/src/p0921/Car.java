package p0921;

public class Car {
	private String color;
	private int door;
	
	Car(){}
	
	Car(String color, int door)
	{
		this.color = color;
		this.door = door;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s,%d",color,door);
	}
}
