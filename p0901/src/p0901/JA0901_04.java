package p0901;

import java.util.Scanner;

public class JA0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력하세요.");
		String number = scan.next();
		System.out.print("더하기값 : ");
		System.out.println((number.charAt(0)-48)+(number.charAt(1)-48));

	}

}
