package p0904;

import java.util.Scanner;

public class j0904_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, op;
		double result=0.0;
		String str;

		System.out.println("첫번째 숫자 입력");
		num1 = scan.nextInt();
		System.out.println("두번째 숫자 입력");
		num2 = scan.nextInt();
		System.out.println("연산자 +-*/ 중 하나를 입력 ");
		str = scan.next();
		op = (int)str.charAt(0);
		
		switch(op)
		{
			case '+' :
			{
				result = (double)num1 + (double)num2;
				break;
			}
			case '-' : 
			{
				result = (double)num1 - (double)num2;
				break;
			}
			case '*' : 
			{
				result = (double)num1 * (double)num2;
				break;
			}
			case '/' :
			{
				result = (double)num1 / (double)num2;
				break;
			}
			default : 
			{
				System.out.println("Wrong operator");
			}
		}
		
		System.out.println("Result : " + result);
		
	} // main

}//class j0904_09 
