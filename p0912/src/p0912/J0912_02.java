package p0912;

import java.util.Scanner;

public class J0912_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int stdlength = 3;
		Stuscore[] s = new Stuscore[stdlength];
		int stuNo = 0 ;
		String name = "";
		int[] score = new int[stdlength];
		int kor = 0, eng = 0 , math = 0;
		String[] subject = {"Korean", "English", "Mathmatics"};
		
		
		
		for( int i = 0 ; i < s.length ; i++)
		{
			stuNo = i + 1;
			System.out.println("Enter your name");
			name = scan.next();
			for ( int j = 0 ; j < score.length ; j++)
			{
				System.out.println("Enter your "+subject[j]+" score");
				score[j] = scan.nextInt();
			}
			
			s[i] = new Stuscore(stuNo,name,score[0],score[1],score[2]);
		}
		

		for ( int i = 0 ; i < s.length ; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f",s[i].stuNo, s[i].name, s[i].kor,s[i].eng, s[i].math, s[i].total, s[i].avg);
		}

//		Stuscore s = new Stuscore();
//		s.stuNo = 1;
//		s.name = "Hong";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 99;
//		s.total = s.kor + s.eng + s.math;
//		s.avg = s.total / 3.0;
//		
//		Stuscore s2 = new Stuscore(2, "Yu", 100, 99,88);
//
//		System.out.println("total : "+s2.total);
//		System.out.println("average : "+s2.avg);
	}

}
