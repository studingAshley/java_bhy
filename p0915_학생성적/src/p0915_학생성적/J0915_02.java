package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice  = 0 ;
		int stuCount = 1 ;
		boolean isloop = true;
		StuAction stuAction = new StuAction();

		//System.out.println(String.format("%s", 100.10));
		
		while(isloop)
		{
			choice = stuAction.mainPrint();
			switch(choice)
			{
			case 1 : //학생입력
				stuAction.setStudent();
				break;
			case 2 : //학생성적출력
				stuAction.getAllStudents();
				break;
			case 3 : //학생수정
				stuAction.modifyData();
				break;
			case 4 : // 학생 삭제
				stuAction.deleteData();
				break;
			case 5 : // 학생 검색 
				stuAction.searchStudents();
				break;
			case 6 : // 등수 처리 
				stuAction.sortList();
				break;
			case 0 : // 프로그램종료 
				System.out.println();
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				isloop = false;
				break;
			
			
			}
			
		}//while
		
	}//main

}//class
