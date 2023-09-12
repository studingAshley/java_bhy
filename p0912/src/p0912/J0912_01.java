package p0912;

public class J0912_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		
		Data1 d1 = new Data1(); 
		Data2 d2 = new Data2();
		
		Car c1 = new Car();
//		
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 5;
		System.out.println(c1.color);
		
		Car c2 = new Car("white","auto",5);
		

	}

}
