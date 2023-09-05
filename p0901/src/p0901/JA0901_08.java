package p0901;

import java.util.Scanner;

public class JA0901_08 {

	public static void main(String[] args) {

//		int x = -10;
//		int absX = (x>=0)?x:-x;
//		
//		System.out.println("절대값 : " + absX);
//		System.out.println("입력값 : "+x);

//		Scanner scan = new Scanner(System.in);
//		int a, b;
//		System.out.println("첫번째 숫자를 입력하시오.");
//		a = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하시오.");
//		b = scan.nextInt();
//		System.out.printf("입력한 수 : %d, %d\n" , a, b);
//		System.out.println("큰 수 출력 : " + ((a>b)? a:b));
		
//		Scanner scan = new Scanner(System.in);
//		int sc = 0;
//		System.out.println("점수 입력 하기");
//		
//		sc = scan.nextInt();
//		
//		System.out.println( (sc>=60)? "합격":"불합격");
		
//		if(sc >= 60)
//		{
//			System.out.println("합격");
//		}
//		else 
//		{
//			System.out.println("불합격");
//		}
		Scanner scan = new Scanner(System.in);	
		System.out.println("점수 입력 하기");
		int score = scan.nextInt();
		String grade  = (score>=90)? "A":(score>=80)? "B":(score>=70)? "C" : (score >= 60)? "D":"F";
		System.out.println("학점 : "+grade);
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println((str1.equals(str2))?"같다":"다르다");
		
	}

}
