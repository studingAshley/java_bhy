package p0907;

import java.util.Scanner;

public class J0907_07_STUDENTS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0 ;
		int count = 0;
		
		String[] subject = {"국어","영어","수학"};
		String[] title = {"학번","이름","국어","영어","수학","합계","평균"};
		String[] name = new String[10];
		int[] stdNum = new int[10];
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];
		
		boolean isloop = true;
		
		while(isloop)
		{
			System.out.println("-------------------------------------");
			System.out.println("----------  학생성적 프로그램  ----------");
			System.out.println("-------------------------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("-------------------------------------");
			System.out.print("원하는 번호를 입력하세요. >> ");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1 : 
				boolean caseisloop = true;
				System.out.println("        [ 성적 입력 화면 ]");
				System.out.println("---------------------------------");
				for(int i = count ; caseisloop && ( i < 10 ) ; i ++)
				{
					stdNum[i] = count+1;
					System.out.println("이전 화면으로 가기 : 0");
					System.out.print(stdNum[i]+"번째 이름을 입력하세요 >> ");
					name[i] = scan.next();
					if(name[i].equals("0"))
					{
						caseisloop = false;
					}
					else 
					{
						count++;
						for(int j = 0 ; caseisloop && (j < 3) ; j++ )
						{
							System.out.print(subject[j]+"점수를 입력하세요 >> ");
							score[i][j] = scan.nextInt();
							total[i] = total[i] + score[i][j];
						}
						avg[i] = total[i]/3.0;
						System.out.println();
						System.out.println(total[i]+" " + avg[i]);
					}
				}
				
				break;
			case 2 : 
				System.out.println("------------------------------------------------------------------");
				System.out.println("                        [ 학생 성적 출력 ]");
				System.out.println("------------------------------------------------------------------");
				
				for(int i = 0 ; i < title.length ; i++)
				{
					System.out.print(title[i]+"\t");
				}
				System.out.println("\n------------------------------------------------------------------");
				for(int i = 0 ; i < count ; i++)
				{
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",stdNum[i],name[i],score[i][0],score[i][1],score[i][2],total[i],avg[i]);
				}
				System.out.println();
				break;
			case 3 : 
				break;
			case 0 : 
				isloop = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
		}//while
		

	}//main

}//class
