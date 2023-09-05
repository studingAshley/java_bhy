package p0901;

public class JA0901_03 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a * b;
//		
//		System.out.printf("%,d",c);

		
		char c1 = 'a';
		char c2 = 97;
		char c3 = 65;
		char c4 = (char) ((int)c1+1);
		char c5 = ++c1;
		char c6 = '0';
		
		int i = '4'-'0';
		int i2 = '7'-'0';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println((char)(c6+1));
		System.out.println(i);
		System.out.println(i2);
	}

}
