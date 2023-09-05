package p0901;

import java.util.Scanner;

public class JA0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요.");
		int number = scan.nextInt();
		scan.nextLine();

		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("국어점수를 입력하세요.");
		String k = scan.nextLine();
		System.out.println("영어점수를 입력하세요.");
		String e = scan.nextLine();
	
		
		int kor = Integer.parseInt(k);
		
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+number);
		System.out.println("국어성적? :"+ kor);
		

	}

}
