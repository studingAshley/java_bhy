package p0920;

import java.util.Scanner;

public class J0920_12 {
	
	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		String str1 = "";
		String str2 = "26나2320411";
		String test = "16가1023456";
		int count = 0 ;

	//	System.out.println(str1);
		
		int temp = ((int)(Math.random()*100));
		if(temp<10)
		{
			str1 = "0"+temp+"가";
		}
		else
		{
			str1 = str1+temp+"가";
		}
		
		//+((int)(Math.random()*100)) + "가" + ((int)(Math.random()*10000000));
		
		String temp2 = ""+((int)(Math.random()*10000000));
		//String temp2 = ""+1;
		for(int i = 7 ; i> temp2.length() ; i--)
		{
			str1 +="0";
		}
		str1 += temp2;
		System.out.println(str1);
		boolean isloop = true;
		while(isloop)
		{
			System.out.println(str2+"형식으로 문자를 입력하기");
			String str3 = scan.next();
			System.out.println("입력 번호 : " + str3);
			System.out.println("랜덤 번호 : "+ str1);
			if(10!=str3.length())
			{
				System.out.println("다시입력하세요");
				continue;
			}
			
			for(int i = 0 ; i < str1.length() ; i++)
			{
				if(str1.charAt(i)==str3.charAt(i))
				{
					count++;
				}
			}
			System.out.println("맞는 개수 : "+count);
			System.out.println();
				
			
		}
		

	}

}
