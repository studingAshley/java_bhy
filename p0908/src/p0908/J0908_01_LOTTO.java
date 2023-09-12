package p0908;

import java.util.Scanner;

public class J0908_01_LOTTO {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNumber = new int[6];
		int[] myNumber = new int[6];
		int[] myWin = new int[6];
		int count = 0 ;

		System.out.println("로또 번호를 입력하시오.");

		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.print((i+1)+"번째 숫자 입력 >> ");
			myNumber[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i < 45 ; i++)
		{
			lotto[i] = (i+1);
		}
		
		for(int i = 0 ; i < 500 ; i++)
		{
			int ran = (int)(Math.random()*45);
			int temp;
			
			temp = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = temp;
		}
		
		System.out.print("당첨번호 : ");
		for(int i = 0 ; i < 6 ; i++)
		{
			winNumber[i] = lotto[i];
			System.out.print(winNumber[i]+"\t");
		}
		System.out.println();
		
		System.out.print("나의번호 : ");
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.print(myNumber[i]+"\t");
		}
		System.out.println();
		
		System.out.print("당첨개수 : ");
		for(int i = 0 ; i < 6 ; i++)
		{
			for(int j = i ; j < 6 ; j++)
			{
				if(winNumber[i]== myNumber[j])
				{
					myWin[count] = myNumber[j];
					count++;
				}
			}
		}
		System.out.println(count);
		
		System.out.print("당첨 번호 : ");
		for(int i = 0 ; i < count ; i++)
		{
			System.out.print(myWin[i]+" ");
		}
		if(count == 0 )
		{
			System.out.print("당첨번호 없음");
		}
		System.out.println();


	}

}
