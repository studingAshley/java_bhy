package p0905;

import java.util.Scanner;

public class J0905_08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int random = ((int)(Math.random()*100))+1;
		boolean roof = true;
		
		System.out.println("[ 숫자 맞추기 게임 ]");
		
		while(roof)
		{
			System.out.println("1-100사이의 숫자를 입력하세요.");
			int num = scan.nextInt();
			if(random == num)
			{
				System.out.println("정답입니다.");
				roof = false;
			}
			else if(num>random)
			{
				System.out.println(num+"보다 작은 수를 입력하세요.");
			}
			else if(num < random)
			{
				System.out.println(num+"보다 큰 수를 입력하세요.");
			}
		}
		
	}

}
