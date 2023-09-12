package p0912;

import java.util.Scanner;

public class J0912_03 {

	public static void main(String[] args) {

		final int datalength = 3;
		Scanner scan = new Scanner(System.in);
		int StdNo = 0;
		int[] score = new int[3];
		String name = "";
		String[] subject = {"Korean","English","Mathmatics"};
		StuScore2[] s = new StuScore2[3];
		
		for(int i = 0 ; i < s.length ; i++ )
		{
			StdNo = i + 1;
			System.out.println("Enter your name");
			name = scan.next();
			for(int j = 0 ; j <subject.length ; j++)
			{
				System.out.println("Enter your "+subject[j]+" score");
				score[j] = scan.nextInt();
			}
			s[i] = new StuScore2(StdNo, name, score[0], score[1], score[2]);
			
		}
		
		for(int i = 0 ; i < s.length ; i++)
		{
			s[i].printData();
		}
		
	}

}
