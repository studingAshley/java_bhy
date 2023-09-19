package p0918_학생성적;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction act1 = new StuAction();
		int choice = 0 ;
		boolean isloop = true;
		
		while(isloop)
		{
			act1.printMain();
			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1 : 
				act1.addStudents();
				break;
			case 2 :
				act1.printStudents();
				break;
			case 3 :
				act1.modifyStudents();
				break;
			case 4 : 
				act1.deleteStudents();
				break;
			case 5 : 
				act1.searchStudents();
				break;
			case 6 : 
				act1.setRank();
				break;
			case 0 : 
				System.out.println("프로그램을 종료하시겠습니까?");
				System.out.println("1. 예");
				System.out.println("0. 아니오(초기 메뉴로)");
				choice = scan.nextInt();
				
				if(choice == 1 )
				{
					isloop = false;
					System.out.println("프로그램을 종료합니다.");
				}
				break;
			default : 
				break;
			}
		}
		
		
		
		// 1. 학생입력
		// 2. 학생 출력
		// 3. 학생 수정
	}

}
