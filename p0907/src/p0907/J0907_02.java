package p0907;

import java.util.Scanner;

public class J0907_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int arrsize1 = 5;
		final int arrsize2 = 5;
		int[][] score = new int [arrsize1][arrsize2];
		int[] temp = new int[25];
		int n = 0 ;
		
		for(int i = 0 ; i < 25 ; i ++)
		{
			temp[i] = i+1;
		}

		
		for(int i = 0 ; i < 400 ; i ++)
		{
			int random = (int)(Math.random()*24);
			n = temp[0];
			temp[0] = temp[random]; 
			temp[random] = n;
			
		}
		
//		for(int i = 0 ; i < 25 ; i ++)
//		{
//			System.out.print(temp[i]+" ");
//		}
//		
//		System.out.println();
		
		
		for(int i = 0 ; i < score.length ; i++)
		{
			for(int j = 0 ; j < score[i].length; j++)
			{
				score[i][j] = temp[i*arrsize1+j];
			}
		}
		
		
		for(;;)
		{
				
			System.out.println("             [숫자맞추기 게임]");
			System.out.println("\t0\t1\t2\t3\t4");
			System.out.println("-------------------------------------------");
			
			for(int i = 0 ; i < score.length ; i++)
			{
				System.out.print(i+"|\t");
				for(int j = 0 ; j < score[i].length; j++)
				{
					System.out.print(score[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("-------------------------------------------");
			
	
//			System.out.println("좌표를 입력하세요.(행)");
//			int input1 = scan.nextInt();
//			System.out.println("좌표를 입력하세요.(열)");
//			int input2 = scan.nextInt();
			
			System.out.println("숫자를 입력하세요.");
			int input1 = scan.nextInt();
			boolean search = true;
			
			for(int i = 0 ; i < score.length && search ; i++)
			{
				for(int j = 0 ; j < score[i].length; j++)
				{
					if(score[i][j] ==input1 )
					{
						score[i][j] = 0 ;
						search = false;
					}
				}
			}
			
		}
		
		
	}

}
