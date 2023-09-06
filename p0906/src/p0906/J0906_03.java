package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int arrlength = 10;
		Scanner scan = new Scanner(System.in);
		String[] name = new String[arrlength];
		String input = "";
		int[] arrKor = new int[arrlength];
		int[] arrEng = new int[arrlength];
		int[] arrMath = new int[arrlength];
		int[] total = new int[arrlength];
		double[] avg = new double[arrlength];
		int count = 0 ; 
		boolean isloop = true;
		
		for(int i = count ; (i < arrlength) && isloop ; i ++)
		{
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요(중단:0)");
			input = scan.next();
			if(!input.equals("0"))
			{
				count++;
				name[i] = input;
				System.out.println("국어, 영어,수학 점수를 입력하세요.");
				System.out.print("국어 점수 >>");
				arrKor[i] = scan.nextInt();
				System.out.print("영어 점수 >>");
				arrEng[i] = scan.nextInt();
				System.out.print("수학 점수 >>");
				arrMath[i] = scan.nextInt();
				
				total[i] = arrKor[i]+arrEng[i]+arrMath[i];
				avg[i] = total[i]/3.0;
			}
			else
			{
				System.out.println("입력을 중지합니다.");
				isloop = false;
			}
		}
	
		System.out.println();
		System.out.println("======================= [ 학생 성적표 ] =========================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("--------------------------------------------------------------");
		for(int i = 0 ; i < count ; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",(i+1),name[i],arrKor[i],arrEng[i],arrMath[i],total[i],avg[i]);
		}


		
		
		
	}//main

}
