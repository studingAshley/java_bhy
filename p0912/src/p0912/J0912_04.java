package p0912;

public class J0912_04 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		Car c2 = new Car(c1);
		c2.color = "blue";

		System.out.println(c1.color);
	}

}
