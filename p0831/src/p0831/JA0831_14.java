package p0831;

public class JA0831_14 {
	public static void main(String[] args)
	{
		int a = 1000000;
		int b = 2000000;
		int x = 1000000;
		int y = 1000000;
		long c = a*b;
		long d = (long)a*b;
		long num = (long)a*x/y;
		long num2 = (long)a/x*y;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(num);
		System.out.println(num2);
	}

}
