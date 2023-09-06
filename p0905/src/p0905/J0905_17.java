package p0905;

import java.util.Scanner;

public class J0905_17 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10];		
		int number = 0;
		int count = 0;
		boolean isit = true;
		int  random = 0;

		random = (int)(Math.random()*100)+1;
	
		for(count=0;(count<10) && isit;count++)
		{
			System.out.println((count+1)+"번째 숫자를 입력하세요.");
			number = scan.nextInt();
			arrNum[count] = number;
			System.out.println("입력한 숫자 : "+number);
			
			if(number > random)
			{
				System.out.println("입력한 숫자보다 작습니다.");
			}
			else if(number < random)
			{
				System.out.println("입력한 숫자보다 큽니다.\n");
			}
			else
			{
				System.out.println("!!!!!!!!!!!!!!!! 정답입니다. !!!!!!!!!!!!!!!!!!!!");
				isit = false; 
			}

		}
		
		if(isit)
		{
			System.out.println("10번 완료! 프로그램을 종료합니다.");
		}
		
		System.out.printf("입력한 숫자 출력 >> ");
		
		for(int i = 0 ; i < count ; i++)
		{
			System.out.printf("%d",arrNum[i]);
			if(i<(count-1))
			{
				System.out.printf(", ");
			}
		}
		System.out.println();
		
		System.out.println("도전 횟수 : "+ count);
		
		System.out.println("랜덤 숫자 : "+random);
		
	}
	

}
