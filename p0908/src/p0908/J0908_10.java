package p0908;

public class J0908_10 {

	int result = 0 ;
	public static void main(String[] args) {
		int result=0;
		
		System.out.println(add(10,3));

		System.out.println(add(222,234));

		System.out.println(add(21,99));

		System.out.println(add(787,676));

		result = add(1127,458);
		System.out.println(result);
		
	}

	static int add(int a, int b)
	{
		return a+b; 
	}
	
}
