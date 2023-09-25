package p0922;

import java.io.FileWriter;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();

		int choice = 0 ;
		boolean isloop = true;
		s.getFile();
		
		while(isloop)
		{
			System.out.println("--------------------------");
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("--------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적낮은순 정렬");
			System.out.println("7. 성적높은순 정렬");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일 저장");
			System.out.println("10. 등수처리");
			System.out.println("0. 프로그램 종료 ");
			System.out.println("--------------------------");

			
			choice = scan.nextInt();
			System.out.println();
					
			switch(choice)
			{
			case 1 : 
				s.stuInput();
				break;
				
			case 2 :
				s.showScore();
				break;
			case 3: 
				s.stuUpdate();
				break;
			case 4 :
				s.stuDelete();
				break;
			case 5 :
				s.stuNameSort();
				break;
			case 6 :
				s.stuTotalSort2();
				break;
			case 7:
				s.stuTotalSort();
				break;
			case 8 : 
				
				break;
			case 9 :
				s.saveFile();
				break;
			case 10 :
				s.stuRank();
				break;
			case 0 : 
				System.out.println("[[ 프로그램 종료 ]]");
				isloop = false;
				break;
			}//switch
			
		}
		
		
		
	}//main

}//class
