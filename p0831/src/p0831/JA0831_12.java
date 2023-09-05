package p0831;

public class JA0831_12 {
	
	public static void main(String[] args)
	{
		int i = 5;
		int j = 0;
		int a = 5;
		int b = 0;
		int x = 5;
		int y = 0;
		int z = 5;
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		j = ++i;
		
//		System.out.println(i);
//		System.out.println(j);
		
		b = a++;
		
//		System.out.println(a);
//		System.out.println(b);		
		
		x++;
		y = x ;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		
		System.out.println(str1.equals(str2));
	}

}
