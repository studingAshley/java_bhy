package p0920;

public class J0920_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("aaa");
		
		for(int i = 0 ; i < 10 ; i++)
		{
			sb.append(i);
		}
		
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		if(equals(sb1,sb2)) // 오버라이딩되어있지 않아 다르다고 나옴 
		{
			System.out.println("sb1과 sb2는 같음");
		}
		else
		{
			System.out.println("sb1과 sb2는 다름");
		}
		
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if(s1.equals(s2)) // 오버라이딩되어있지 않아 다르다고 나옴 
		{
			System.out.println("s1과 s2는 같음");
		}
		else
		{
			System.out.println("s1과 s2는 다름");
		}
		
	}
	
	static boolean equals(StringBuffer s1, StringBuffer s2)
	{
		int length = 0 ;
		boolean issame = true;
	
		if(s1.length() >s2.length())
		{
			length = s2.length();
		}
		else
		{
			length = s1.length();
		}
		
		for(int i = 0 ; i < length ; i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				issame = false;
			}
		}
		
		return issame;
	}

}
