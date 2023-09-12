package p0911;

import java.util.Scanner;

public class J0911_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	//	J0911_04 j = new J0911_04();
		boolean isloop = true;
		
		while(isloop)
		{
		
			System.out.println("1번째 수를 입력하세요(0. 프로그램 종료)");
			int a = scan.nextInt();
			if(a == 0 )
			{
				System.out.println("종료");
				break;
			}
			System.out.println("2번째 수를 입력하세요");
			int b = scan.nextInt();
			
			int res = max(a, b);
			
			System.out.println("큰 수 : "+res);
			
			
		}
	
	}
	
	static int max(int a, int b)
	{
		
		if(a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}

}
