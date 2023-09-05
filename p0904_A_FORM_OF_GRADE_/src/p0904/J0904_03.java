package p0904;

import java.util.Scanner;

public class J0904_03 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		boolean isnum = true ;
		int size = 0 ;
		
		System.out.println("값을 입력하세요");
		str = scan.next();
	
//		num = Integer.valueOf(str);
		size = str.length();
		
		for(int i = 0 ; i < size ; i++)
		{
			char ee = str.charAt(i);
			if ( !(ee >= 48 && ee <= 57) )
			{
				isnum = false;
			}
		
		}
		
		if(isnum)
		{
			System.out.println("숫자타입");
		}
		else
		{
			System.out.println("문자타입");
		}
//		char in;
//		
//		System.out.println("프로그램을 종료하려면 x 또는 X를 입력하세요");
//		in = scan.next().charAt(0);
//		
//		System.out.println("입력한 키 " + in);
//		
//		if(in == 'x' || in == 'X')
//		{
//			System.out.println("프로그램을 종료합니다.");
//		}
		

	}

}
