package p0901;

import java.util.Scanner;

public class JAVA0901_06 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(10/8);
//		System.out.println(10%8);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력하기");
		
		if((scan.nextInt()%3) == 0 )
		{
			System.out.println("3의 배수임");
		}
		else
		{
			System.out.println("3의 배수 아님");
		}

	}

}
