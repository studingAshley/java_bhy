package p0914;

public class J0914_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c;
		FireEngine f1 = new FireEngine();
		System.out.println("[A function of f1]");
		f1.go();
		f1.stop();
		f1.water();
		
		c = f1; //Car 형변환 생략가능
		
		Ambulance a1 = new Ambulance();
		c = a1;
		
		
		System.out.println("[A fucntion of c]");
		c.go();
		c.stop();
		//c.water() // c에 , water()공간은 있지만 c참조변수는 water()를 사용할 수 없음
		
		
		System.out.println("[A fucntion of f2]");
		FireEngine f2;
		Ambulance a2;
		if(c instanceof FireEngine)
		{
			f2 = (FireEngine)c;
			f2.go();
			f2.stop();
			f2.water();
		}
		
		if(c instanceof Ambulance)
		{
			a2 = (Ambulance)c;
			a2.go();
			a2.stop();
			a2.siren();
		}
		
//		f2 = (FireEngine)c; //형변환 생략불가 
//		f2.go();
//		f2.stop();
//		f2.water();
	}

}
