package p0904;

import java.util.Scanner;

public class J0904_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sc = 0 ;
		System.out.println("점수를 입력하세요.");
		sc = scan.nextInt();
		
		if(sc >= 90)
		{
			System.out.println("학점 : A");
		}
		else if (sc >= 80)
		{
			System.out.println("학점 : B");
		}
		else if (sc >= 70)
		{
			System.out.println("학점 : C");
		}
		else if (sc >= 60)
		{
			System.out.println("학점 : D");
		}
		else 
		{
			System.out.println("학점 : F");
		}
		
		System.out.println("점수 : "+ sc);
		
//		int nInput = 0;
//		
//		System.out.println("숫자를입력하시오");
//		nInput = scan.nextInt();
//		System.out.println("입력한 숫자 : "+nInput);
//		if(0 < nInput)
//		{
//			System.out.println("0을 초과하는 숫자");
//		}
//		else if (0>nInput)
//		{
//			System.out.println("0의 미만인 숫자");
//		}
//		else
//		{
//			System.out.println("0인 숫자");
//		}
		
//		==================================================
//		int sc = 0;
//		
//		System.out.println("점수를 입력하세요");
//		sc = scan.nextInt();
//		
//		System.out.println("점수 : " + sc );
//		
//		if( 60 >= sc ) {
//			System.out.println("합격");
//		}
//		else
//		{
//			System.out.println("불합격");
//		}

	}

}
