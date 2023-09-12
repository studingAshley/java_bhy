package p0911;

import java.util.Scanner;

public class J0911_10 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 숫자 : ");
		cal.num1 = scan.nextInt();
		System.out.println("두번째 숫자 : ");
		cal.num2 = scan.nextInt();
		
//	calculate(cal);
		cal.calculate();

		System.out.println("더하기 결과값 : "+ cal.addResult);
		System.out.println("빼기 결과값 : "+ cal.subResult);
		System.out.println("곱하기 결과값 : "+ cal.multiResult);
		System.out.println("나누기 결과값 : "+ cal.divResult);
	}
	
//	static void calculate (Calculator c)
//	{
//		c.addResult = c.num1 + c.num2;
//		c.subResult = c.num1 - c.num2;
//		c.multiResult = c.num1 * c.num2;
//		c.divResult = c.num1 / (double) c.num2;
//	}

}
