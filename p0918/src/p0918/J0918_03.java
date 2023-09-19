package p0918;

public class J0918_03 {

	public static void main(String[] args) {
		Tank t = new Tank();
		Scv s  = new Scv();
		Marine m = new Marine();
		Dropship d = new Dropship();
		
		System.out.println("탱크가 폭탄을 맞음");
		t.hitPoint -= 10;
		System.out.println("탱크가 폭탄을 맞음");
		t.hitPoint -= 10;
		System.out.println("총알을 맞음");
		t.hitPoint -= 2;
		System.out.println("탱크의 체력 : "+t.hitPoint);

		s.repair(t);
		System.out.println("탱크의 체력 : "+t.hitPoint);
		
		System.out.println("드랍쉽이 총알을 맞음");
		d.hitPoint -=20;
		System.out.println("드랍쉽의 체력 : "+d.hitPoint);
		
		s.repair(d);
		
		System.out.println("마린이 총알을 맞음");
		m.hitPoint -= 30;
		System.out.println("마린의 체력 : "+m.hitPoint);
		//s.repair(m);
		System.out.println("마린의 체력 : "+m.hitPoint);
	}


}
