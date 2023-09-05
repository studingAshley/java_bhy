package p0904;

import java.util.Scanner;

public class J0904_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int nFirst = 0;
//		int nSecond = 0 ;
//		int result = 0;
//		
//		System.out.println("첫번째 숫자를 입력하세요");
//		nFirst = scan.nextInt();
//		scan.nextLine();
//		System.out.println("두번째 숫자를 입력하세요");
//		nSecond = scan.nextInt();
//		scan.nextLine();
//		System.out.println("입력한 두 수의 곱을 입력하세요");
//		result = scan.nextInt();
//		
//		if(result == (nFirst*nSecond))
//		{
//			System.out.println("정답입니다.");
//		}
//		else
//		{
//			System.out.println("오답입니다.");
//		}
		
//		int sc = 0;
//		System.out.println("5*4는 얼마일까요?");
//		
//		sc = scan.nextInt();
//		
//		if(sc == 20)
//		{
//			System.out.println("정답");
//		}
//		else
//		{
//			System.out.println("오답");
//		}
		String str = "";
		
		System.out.println("Answer what \"사랑\" means in English");
		
		str = scan.next();
		
		if(str.equalsIgnoreCase("love")  ) 
		{
			System.out.println("Right");
		}
		else
		{
			System.out.println("Wrong");
		}
		
	}

}
