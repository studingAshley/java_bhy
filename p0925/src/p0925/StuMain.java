package p0925;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		int choice = 0 ;
		StuAction sa = new StuAction();
		
		
		while(isloop)
		{
//////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("-----------------------------");
			System.out.println("    [ 학생성적처리 프로그램 ] ");
			System.out.println("-----------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적높은순 정렬");
			System.out.println("7. 성적낮은순 정렬");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장");
			
			System.out.println("10. 등수처리");
			
			System.out.println("0. 프로그램 종료");
			
//////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("-----------------------------");
			System.out.print("원하는 메뉴를 입력하세요 >> ");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice)
			{
			case 0 :
				System.out.println("[[ 프로그램을 종료합니다. ]]");
				isloop = false;
				break;
			case 1 : 
				sa.stuPut();
				break;
			case 2 :
				sa.stuPrint();
				break;
			case 3 : 
				sa.stuUpdate();
				break;
			case 4 :
				sa.stuDelete();
				break;
			case 5 : 
				sa.stuSortName();
				break;
			case 6 :
				sa.stuSortTotalHigh();
				break;
			case 7 : 
				sa.stuSortTotalLow();
				break;
			case 8 :
				sa.stuGetFile();
				break;
			case 9 : 
				sa.stuPutFile();
				break;
			case 10 :
				sa.sutSetRank();
				break;
			
			}//switch
			
			
		}//while

	}

}
