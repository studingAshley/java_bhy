package p0920;

import java.util.Scanner;


public class J0920_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "abcdefghijk";
	
	
		System.out.println(str.charAt(5));
		
		System.out.println(str.subSequence(5, 9));
		System.out.println(str.substring(5));
		
		String no = "com202311001";//com 컴공 2023입학년도 11담당교수 001번호

		System.out.println("입학년도 : " + no.substring(3,7));
		System.out.println("번호 : "+no.substring(9));
		
		System.out.println(no.substring(3, 11));
		
		System.out.println("원하는 글자를 입력하세요");
		
	//	String input = scan.next();
		
	//	System.out.println(input.substring(0,input.length()-1));
		
		String hobbys = "수영,조깅,독서,요리,영화감상,게임,골프,자전거,테니스";
		
		System.out.println(hobbys.contains("요리"));
	
	}

}
