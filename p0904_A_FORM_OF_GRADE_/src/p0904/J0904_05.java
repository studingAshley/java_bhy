package p0904;

import java.util.Scanner;

public class J0904_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = scan.nextInt();
		
		if(num1 < num2)
		{
			System.out.println("큰 수 : " + num2);
		}
		else if(num1 > num2 )
		{
			System.out.println("큰 수 : " + num1);
		}
		else
		{
			System.out.println("같음");
		}
		

		
	}

}
