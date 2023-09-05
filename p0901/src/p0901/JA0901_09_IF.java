package p0901;

import java.util.Scanner;


public class JA0901_09_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int num = 0;
//		
//		System.out.println("사원번호를 입력하세요.");
//
//		num = scan.nextInt();
//		
//		System.out.println("[ 네비게이션 메뉴 ]");
//		System.out.println("1. 회원정보보기");
//		System.out.println("2. 상품정보보기");
//		System.out.println("3. 회사소개보기");
//		if(num == 1001)
//		{
//			System.out.println("4. 회사매출액 보기");
//		}
//		else
//		{
//			
//		}
		
//		System.out.println("점수를 입력하세요.");
//		
//		int number = scan.nextInt();
//		if(number >= 60)
//		{
//			System.out.println("합격");
//		}
//		else
//		{
//			System.out.println("불합격");
//		}

		System.out.println("점수를 입력하세요.");
		int number = scan.nextInt();
		
		if(number>100 || number <0)
		{
			System.out.println("입력 범위 초과");
		}
		else if(number>=90)
		{
			System.out.println("A학점");
		}
		else if(number >= 80)
		{
			System.out.println("B학점");
		}
		else if(number >= 70)
		{
			System.out.println("C학점");
		}
		else if(number >= 60)
		{
			System.out.println("D학점");
		}
		else if(number >= 0)
		{
			System.out.println("F학점");
		}
	
	}
	
}
