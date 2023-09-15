package p0915_test;

import java.util.Scanner;

public class J01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		JMethod j = new JMethod();
		
		System.out.println("첫번째 숫자를 입력하세요");
		int n1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int n2 = scan.nextInt();
		
		System.out.printf("결과 : %d\n",j.cal(n1, n2));
	}

}
