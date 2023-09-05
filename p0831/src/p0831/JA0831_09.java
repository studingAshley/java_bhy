package p0831;

import java.util.Scanner;

public class JA0831_09 {

	public static void main(String[] args) {
	
		int number = 0;
		String str = new String();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신이 원하는 숫자를 입력하세요.");
		
		number = scan.nextInt();

		
		System.out.printf("입력한 숫자 : %d\n", number);

	}

}
