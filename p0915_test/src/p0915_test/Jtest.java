package p0915_test;

public class Jtest {
	public static void main(String[] args) {
		
		StuAction stuAct = new StuAction();
		boolean isloop = true;
		
		while(isloop)
		{
			int choice = stuAct.printMain();
			
			switch(choice)
			{
			case 1 : // 학생입력
				stuAct.setStudents(); 
				break;
			case 2 : //학생출력
				stuAct.printAllStudents();
				break;
				
			case 3 : //학생수정
				stuAct.modifyData();
				break;
				
			case 4 : 
				break;
				
			case 5 : 
				break;
				
			case 6 : 
				break;
				
			case 0 : 
				System.out.println("프로그램을 종료합니다.");
				isloop = false;
				break;

			}
		} //while

		
	}//main

}//class
