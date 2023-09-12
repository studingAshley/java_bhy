package p0911;

public class CarProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 5;
		
		Car c2 = new Car("Red","auto",4);
		Car c3 = new Car("Black","auto",5);
		Car c4 = new Car("Silver","auto",5);
		Car c5 = new Car("Green","auto",4);
		Car c6 = new Car("Pink","stick",5);

	}

}

