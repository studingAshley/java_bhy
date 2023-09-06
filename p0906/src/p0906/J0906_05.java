package p0906;

import java.util.Scanner;

public class J0906_05 {

	public static void main(String[] args) {
		// 빨리 클래스했으면 좋겠다
		
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winLotto = new int[6];
		int[] myNumber = new int[6];
		
		System.out.println("로또 번호를 입력하세요.(1-45)");
		for(int i = 0 ; i < 6 ; i++)
		{
			myNumber[i]= scan.nextInt();
		}
		
		//당첨번호 만들기
		for(int i = 0 ; i < lotto.length ; i++)
		{
			lotto[i] = i + 1;
		}
		
		for(int i = 0 ; i < 500 ; i++)
		{
			int random = (int)(Math.random()*45);
			int temp = 0 ;
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		for(int i = 0 ; i < 6 ; i++)
		{
			winLotto[i] = lotto[i];
		}
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("                           와하하하하핳");
		System.out.println("--------------------------------------------------------------");
		System.out.print("★당첨번호 :\t");
		for(int i = 0 ; i < winLotto.length;i++)
		{
			if(winLotto[i]<10)
			{
				System.out.print("[0");
			}
			else
			{
				System.out.print("[");
			}
			System.out.printf("%d]",winLotto[i]);
			if(i < winLotto.length-1)
			{
				System.out.print("\t");
			}
		}
		System.out.println();
		System.out.print("◆나의입력번호 :\t");
		for(int i = 0 ; i < myNumber.length;i++)
		{
			if(myNumber[i]<10)
			{
				System.out.print("[0");
			}
			else
			{
				System.out.print("[");
			}
			System.out.printf("%d]",myNumber[i]);
			if(i < myNumber.length-1)
			{
				System.out.print("\t");
			}
		}
	}

}
