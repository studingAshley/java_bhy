package p0920;

import java.util.Scanner;

public class J0920_05 {

	public static void main(String[] args) {

		String num = "";
		Scanner scan = new Scanner(System.in);
		
		num = scan.next();
		
		System.out.print("당신의 나이 : ");
		if(num.charAt(7) == '1' || (int)num.charAt(7) == '2')
		{
			System.out.println(2023 - Integer.parseInt(new String("19"+num.substring(0,2))));
		}
		else if (num.charAt(7) == '3' || num.charAt(7) == '4')
		{
			System.out.println((int)2023 - Integer.parseInt(new String("20"+num.substring(0,2))));
		}

		// 12,1,2 : 겨울  3,4,5 : 봄 6,7,8 : 여름 9,10,11 : 가을
		
		String season ="";

		switch(Integer.parseInt(new String(num.substring(2,4))))
		{
		case 12 : 
		case 1 :
		case 2 : 
			season = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 : 
			season = "봄";
			break;
		case 6 : 
		case 7 :
		case 8 :
			season = "여름";
			break;
		case 9 :
		case 10 : 
		case 11 : 
			season = "가을";
			break;
		}
		
		System.out.println("태어난 계절 : " + season);
	}

}
