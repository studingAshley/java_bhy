package p0911;

public class J0911_06 {

	public static void main(String[] args) {


		Data d = new Data();
		
		d.x = 10;
	//	d.s[0] = 222;
		System.out.println(d.x);
	//	System.out.println(d.s[0]);
		test(d);
//		test2(d.s);
		
		System.out.println(d.x);
//		System.out.println(d.s[0]);
	}
	
	static void test(Data d)
	{
		d.x = 1000;
		
		System.out.println("test : "+d.x);
	}
	
	static void test2(int[] s)
	{
		s[0] = 333;
		System.out.println("test2 : "+s[0]);
	}

}

