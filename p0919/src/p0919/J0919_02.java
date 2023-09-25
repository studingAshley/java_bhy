package p0919;

public class J0919_02 {
	
	public static void main(String[] args) {
		KorPerson k1 = new KorPerson("8801010-1101111","Honggg");
		KorPerson k2 = new KorPerson("8801010-1101111","Honggg");
		KorPerson k3 = new KorPerson("8801010-1101111","Yuuuuu");
		
		if(k1.equals(k2))
		{
			System.out.println(" k1 same k2 ");
		}
		else 
		{
			System.out.println("k1 defer k2");
		}

		System.out.println(k1);
		System.out.println(k2);
		
		if(k1.equals(k3))
		{
			System.out.println(" k1 same k3 ");
		}
		else 
		{
			System.out.println("k1 defer k3");
		}

		System.out.println(k1);
		System.out.println(k3);
		
		String a = new String("a");
		a.equals("a");
	}
	
	

}
