package p0901;

import java.util.Scanner;

public class JA0901_07 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("단어 1개를 입력하세요.");
		String str = scan.next();
		
		char ch = 0;
		int len = str.length();
		boolean ischar = true;
		
		for(int i = 0 ; (i < len) && ischar ; i++)
		{
			ch = str.charAt(i);
			if( (ch >= 65) &&( ch <= 128) )
			{
				
			}
//			else if((ch >= 97) && (ch <= 128))
//			{
//				
//			}
			else
			{
				ischar = false;
			}
		}
		
		if(ischar)
		{
			System.out.println("영문자 타입 단어 맞음");
		}
		else
		{
			System.out.println("영문자 타입 단어 아님 ");
		}
	}

}
