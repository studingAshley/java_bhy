package p0906;

import java.util.Scanner;

public class J0906_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] subject = {"국어", "영어","수학"};
		int score[][] = new int[5][3];
		

		for(int i = 0 ; i < 5 ; i ++)
		{
			for(int j = 0; j < 3 ; j++)
			{
				System.out.printf("%d번째 %s점수를 입력하시오 >> ",(i+1), subject[j]);
				score[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("국어\t영어\t수학");
		System.out.println("-------------------------");
		for(int i = 0 ; i < 5 ; i ++)
		{
			for(int j = 0; j < 3 ; j++)
			{
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		
//		int[] arrKor = new int[5];
//		int[] arrEng = new int[5];
//		int[] arrMath = new int[5];
//		
//		for(int i = 0 ; i < 5 ; i++)
//		{
//			System.out.println();
//			arrKor[i] = scan.nextInt();
//			System.out.println();
//			arrEng[i] = scan.nextInt();
//			System.out.println();
//			arrMath[i] = scan.nextInt();
//		}//for

	}// main

}// classssssssssssssss
