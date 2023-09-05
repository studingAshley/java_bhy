package p0905;

import java.util.Scanner;

public class J0905_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inputNum;
		int ran = ((int)(Math.random()*10))+1;
		boolean Wow = true;
		
		for(int i = 0 ; (Wow && i < 5) ; i++)
		{
			System.out.println("숫자를 입력하세요.");
			inputNum = scan.nextInt();
			if(ran != inputNum)
			{
				System.out.println("틀렸음");
			}
			else
			{
				System.out.println("정답임");
				Wow=false;
			}
		}

		
		System.out.println("랜덤숫자 : "+ran);
	
	}

}
