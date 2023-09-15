package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		JMethod j = new JMethod();

//		System.out.println("첫번째 숫자 입력 ");
//		int n1 = scan.nextInt();
//		System.out.println("두번째 숫자 입력 ");
//		int n2 = scan.nextInt();
//		System.out.println("세번째 숫자 입력 ");
//		int n3 = scan.nextInt();
//		System.out.println("네번째 숫자 입력 ");
//		int n4 = scan.nextInt();
//		
//		System.out.printf("결과값 : %d\n",j.cal2(n1, n2, n3, n4));
		
		int[] n = new int[4];
		
		for(int i = 0 ; i < n.length ; i++)
		{
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			n[i] = scan.nextInt();
		}
	//	System.out.printf("결과값 : %d\n",j.cal2(n[0], n[1], n[2], n[3]));
		System.out.printf("결과값 : %d\n",j.cal(n));
		
		
	}//main
	

}
