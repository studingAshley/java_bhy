package p0905;

import java.util.Scanner;

public class J0905_15 {
	
	public static void main(String[] args) {
		//빨리 객체 했으면 좋겠다. 
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int i = 0 , input = 0;
		boolean w = true;
		
		for(i = 0 ; (i < 10) && w; i++)
		{
			System.out.println("1-100사이의 숫자를 입력하세요");
			input = scan.nextInt();
			
			if(input > random)
			{
				System.out.println(input+"보다 작은 수입니다.");
			}
			else if (input < random)
			{
				System.out.println(input+"보다 큰 수 입니다.");
			}
			else
			{
				System.out.println("정답입니다.");
				w = false;
			}
		}
		
		System.out.println("랜덤 숫자 :"+random);
	}
	

}
