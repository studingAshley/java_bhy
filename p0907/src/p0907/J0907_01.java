package p0907;

public class J0907_01 {

	public static void main(String[] args) {

		final int arrsize = 10;
		final int arrsize2 = 5;
		final int arrsize3 = 5;
		int[][] num = new int[arrsize2][arrsize3];
		
		for(int i = 0 ; i < num.length ; i ++)
		{
			for(int j = 0 ; j < num[i].length; j++)
			{
				num[i][j] = (arrsize3*i)+(j+1);
			}
		}
		
		for(int i = 0 ; i < num.length ; i ++)
		{
			for(int j = 0 ; j < num[i].length; j++)
			{
				System.out.printf("%d\t",num[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//1차원배열
		int[] score = new int[arrsize];
		
		for(int i = 0 ; i < score.length ; i ++)
		{
			score[i] = i + 1 ;
		}
		
		for(int i = 0 ; i < score.length ; i ++)
		{
			System.out.println(score[i]);
		}

	}//main

}//class
