package p0905;

import java.util.Scanner;

public class J0905_11_Form {

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
					System.out.println("성적입력을 선택하셨습니다.");
					break;
				}
				case 2 : 
				{
					System.out.println("성적출력을 선택하셨습니다.");
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
