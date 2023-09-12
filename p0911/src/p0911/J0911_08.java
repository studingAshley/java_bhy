package p0911;

import java.util.Scanner;

public class J0911_08 {

	public static void main(String[] args) {

		Cal cal = new Cal();
		int result = 0 ;
		
		result = cal.addInput();
		System.out.println("결과값 : "+result);

	}

}

class Cal
{
	int addInput()
	{
		Scanner scan = new Scanner(System.in);
		int result = 0 ; 
		int a = 0 ;
		int b = 0 ;
		
		System.out.println("1번째 숫자 : ");
		a = scan.nextInt();
		System.out.println("2번째 숫자 : ");
		b = scan.nextInt();
		
		result = a+b;
		
		return result;
	}
}