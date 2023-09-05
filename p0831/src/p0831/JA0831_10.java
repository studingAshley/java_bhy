package p0831;

import java.util.Scanner;

public class JA0831_10 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String id = "";
		String pw = "";
		String kor = "";
		String math = "";
		
		System.out.println("아이디를 입력하세요.");
		id = scan.next();//문자열
		System.out.println("패스워드를 입력하세요.");
		pw = scan.next();
		
		System.out.println("아이디 : "+id);
		System.out.println("패스워드 : " + pw);
		
		System.out.print("국어 점수 입력 : ");
		kor = scan.next();
		System.out.print("수학 점수 입력 :");
		math = scan.next();
		
		System.out.println("국어점수 : " + kor);
		System.out.println("수학점수 : " + math);
		

	}

}
