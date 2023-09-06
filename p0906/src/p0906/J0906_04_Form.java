package p0906;

import java.util.Scanner;

public class J0906_04_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int choice = 0 ; 
		
		final int arrlength = 10;
		String[] name = new String[arrlength];
		String input = "";
		int[] arrKor = new int[arrlength];
		int[] arrEng = new int[arrlength];
		int[] arrMath = new int[arrlength];
		int[] total = new int[arrlength];
		double[] avg = new double[arrlength];
		int count = 0 ; 
		boolean isloop = true;
		
		
		while(choice != 4) {
			isloop = true;
			System.out.println("[학생성적 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 종료");
			System.out.println("--------------");
			
			System.out.print("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			switch(choice)
			{
				case 1 : 
				{
					System.out.println("[성적입력선택]\n");
					
					for(int i = count ; (i < arrlength) && isloop ; i ++)
					{
						System.out.println((i+1)+"번째 학생의 이름을 입력하세요(이전 화면 :0)");
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
					
					break;
				}
				case 2 : 
				{
					System.out.println("[성적출력선택]");
					System.out.println("--------------------------------------------------------------");
					System.out.println("======================= [ 학생 성적표 ] =========================");
					System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균");
					System.out.println("--------------------------------------------------------------");
					for(int i = 0 ; i < count ; i++)
					{
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",(i+1),name[i],arrKor[i],arrEng[i],arrMath[i],total[i],avg[i]);
					}

					break;
			
				}
				case 3 : 
				{
					System.out.println("성적수정을 선택하셨습니다.");
					break;
				}	
				case 4 :
				{
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			System.out.println();
			
		}		
	}

}
