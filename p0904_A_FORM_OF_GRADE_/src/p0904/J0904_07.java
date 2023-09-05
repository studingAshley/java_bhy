package p0904;

import java.util.Scanner;

public class J0904_07 {

	public static void main(String[] args) {


//		double temp1 = Math.random();
//		double temp2 = Math.random();
//		double temp3 = Math.random();
//		double temp4 = Math.random();
//		double temp5 = Math.random();
//		
//		int num1 = ((int)(temp1*100.0))+1;
//		int num2 = ((int)(temp2*100.0))+1;
//		int num3 = ((int)(temp3*100.0))+1;
//		int num4 = ((int)(temp4*100.0))+1;
//		int num5 = ((int)(temp5*100.0))+1;
//
//		System.out.println("num1 : "+num1);
//		System.out.println("num2 : "+num20);
//		System.out.println("num3 : "+num3);
//		System.out.println("num4 : "+num4);
//		System.out.println("num5 : "+num5);
		
//		System.out.println("난수 : "+ (((int)(Math.random()*10))+1));
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		int ran = ((int)(Math.random()*10))+1;
				
		System.out.println("1 - 10 사이의 숫자를 입력하시오.");
		System.out.println("첫번째 수를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("두번째 수를 입력하세요");
		num2 = scan.nextInt();
		System.out.println("세번째 수를 입력하세요");
		num3 = scan.nextInt();
		
		if(ran == num1 || ran == num2 || ran == num3 )
		{
			System.out.println("정답");
		}
		else
		{
			System.out.println("오답 ");
		}
		
		if(ran == num1)
		{
			System.out.println("첫번째 입력한 수가 정답 : " + num1);
		}
		else if (ran == num2)
		{
			System.out.println("두번째 입력한 수가 정답 : " + num2);
		}
		else if (ran == num3)
		{
			System.out.println("세번째 입력한 수가 정답 : " + num3);
		}
		else 
		{
			System.out.println("다틀렸따내 ... 정답은 "+ran);
		}
		

	}

}
