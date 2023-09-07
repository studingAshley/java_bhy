package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] myNumber = new int[6];
		int[] winNumber = new int[6];
		int temp = 0 ;
		int count =0;

		for(int i = 0 ; i < lotto.length ; i++)
		{
			lotto[i] = i + 1;
		}

		for(int i = 0 ; i < 200; i ++)
		{
			int random = (int)(Math.random()*44)+1;
			temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}//for
		
		for(int i = 0 ; i < 6 ; i++)
		{
			winNumber[i] = lotto[i];
		}//for

		//
		Arrays.sort(winNumber);
//		for(int i = 0 ; i < 5 ; i++)
//		{
//			int Min = 0;			
//			for(int j = i ; j < 6 ; j++)
//			{
//				if(winNumber[i]>winNumber[j])
//				{
//					Min = winNumber[j];
//					winNumber[j] = winNumber[i];
//					winNumber[i] = Min;
//				}
//			}
//			
//		}
		
		//
		
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.println(i+"번째 로또 번호 입력");
			myNumber[i] = scan.nextInt();
		}
		
		//
		System.out.println("-----------------------------------------");
		System.out.println("-------------    당첨 확인    -------------");
		System.out.println("-----------------------------------------");
		System.out.print("★당첨번호 : ");
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.print(winNumber[i]+" ");
		}
		System.out.println();
		System.out.print("☆입력번호 : ");
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.print(myNumber[i]+" ");
		}
		System.out.println();
		
		//


		for(int i = 0 ; i < 6 ; i++)
		{
			boolean isit = true;
			for(int j = i ; isit && ( j < 6 ); j++)
			{ 
				if(winNumber[i] == myNumber[j])
				{
					count++;
					isit = false;
				}
			}
		}
		
		System.out.println("●당첨개수 : "+count+"개");
	}//main
}//class
