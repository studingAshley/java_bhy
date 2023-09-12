package p0912;

public class J0912_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		
		//Point p = new Point(150,150);
		Circle c2 = new Circle(new Point(150,150),50,"Circle");
		
		Point[] p = { 	
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};
		
		Triangle t1 = new Triangle(p,"Triangle");
		t1.draw();
		Triangle t2 = new Triangle(new Point(10,10),new Point(20,20), new Point(100,100),"Triangle");
		t2.draw();

	}

}
