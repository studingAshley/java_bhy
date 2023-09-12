package p0912;

public class J0912_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.pName = "led55";
		p1.price = 50;
		Product p2 = new Product("led60",100);

		Product p3 = new Product();
		p3.pName = "led70";
		p3.price = 200;
		Product p4 = new Product("led75" );

		Product p5 = new Product();
		p5.pName = "led100";
		p5.price = 400;
		
		System.out.println("p1 Number : " + p1.serialNo);
		System.out.println("- Name : " + p1.pName);
		System.out.println("- Price : " + p1.price);
		System.out.println("p2 Number : " + p2.serialNo);
		System.out.println("- Name : " + p2.pName);
		System.out.println("- Price : " + p2.price);
		System.out.println(p3.serialNo);
		System.out.println(p4.serialNo);
		System.out.println(p5.serialNo);
		
	}

}
