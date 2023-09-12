package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
//		int a = 0 ;
//		int b = 0 ;
//		int c = 0;
//		int d = 0 ;
//		int e = 0;
		int result = 0 ;
		
		int[] n = new int[7];
		
	//	System.out.println("어느 계산을 하고 싶나요?");

//		System.out.println("첫번째 숫자 입력 ");
//		a = scan.nextInt();
//		System.out.println("두번째 숫자 입력 ");
//		b = scan.nextInt();
//		System.out.println("세번째 숫자 입력 ");
//		c = scan.nextInt();
//		System.out.println("네번째 숫자 입력 ");
//		d = scan.nextInt();
//		System.out.println("다섯번째 숫자 입력 ");
//		e = scan.nextInt();


		System.out.println(result);
		test(result);
		System.out.println(result);
		System.out.println(n.hashCode());
		for(int i = 0 ; i < n.length; i++)
		{
			System.out.println((i+1)+"번째 숫자 입력");
			n[i] = scan.nextInt();
		}
		
		result = add(n);
		System.out.println("더하기 결과값 : " + result );
		
		result = sub(n);
		System.out.println("빼기 결과값 : " + result );
		
		result = mult(n);
		System.out.println("곱하기 결과값 : " + result );
		
		result = div(n);
		System.out.println("나누기 결과값 : " + result );


	}
	
	static int add(int[] n)
	{
		System.out.println(n.hashCode());
		int result = n[0];
		for(int i = 1 ; i < n.length ; i++)
		{
			result = result + n[i];
		}

		return result;
	}

	static int sub(int[] n)
	{
		int result = n[0];
		for(int i = 1 ; i < n.length ; i++)
		{
			result = result - n[i];
		}
		return result;
	}
	
	static int mult(int[] n)
	{
		int result = n[0];
		for(int i = 1 ; i < n.length ; i++)
		{
			result = result * n[i];
		}
		return result;
	}
	
	static int div(int[] n)
	{

		int result = n[0];
		for(int i = 1 ; i < n.length ; i++)
		{
			result = result / n[i];
		}
		return result;
	}
	
	static void test(int r)
	{
		r = 1000;
		
		System.out.println(r);
	}
	
}
