package p0905;

import java.util.Scanner;

public class J0905_16 {
	
	public static void main(String[] args) {
		//빨리 객체 했으면 좋겠다. 

		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int count = 0 ;
		int number = 0 ;
		boolean isit = true;
		int[] arrNum = new int[10];
		
		System.out.println(random);
		for(count = 0;isit && count < 10;count++)
		{
			System.out.println("숫자를 입력하세요.");
			number = scan.nextInt();
			arrNum[count] = number;
			
			if(number == random)
			{
				System.out.println("정답입니다.");
				isit = false;
			}
		}
		
		if(isit)
		{
			System.out.println("10번을 모두 하셨습니다. 프로그램을 종료합니다.");
		}
		
		System.out.println("도전 횟수 : " + (count));
		System.out.println("[입력한 숫자]");
		
		for(int i = 0; i < count ; i++)
		{
			System.out.printf("%d",arrNum[i]);
			if(i<(count-1))
			{
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("랜덤 숫자 : "+random);
	}
	

}
