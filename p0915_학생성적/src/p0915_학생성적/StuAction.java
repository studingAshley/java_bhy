package p0915_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	
	private ArrayList<StuScore> list = new ArrayList<StuScore>();
	private final String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	public StuAction()
	{
		//
	}
	
	int mainPrint()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("   [ 학생성적 프로그램 ]");
		System.out.println("-----------------------");
		System.out.println("1. 학생입력");
		System.out.println("2. 학생출력");
		System.out.println("3. 학생수정");
		System.out.println("4. 학생삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("원하는 번호를 입력하세요.");
		
		return scan.nextInt();
	}
	
	
	void setStudent() //case 1 학생입력
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		
		while(isloop)
		{
			System.out.println("[ 학생 입력 ] (0. 이전페이지 이동)");
			System.out.printf("%d번째 학생의 이름을 입력하세요.\n", list.size() + 1);
			String name = scan.next();
			
			if(!name.equals("0"))
			{
				System.out.println("국어점수를 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = scan.nextInt();
				
				list.add(new StuScore(name,kor,eng,math));
				
				System.out.printf("%d번째 학생 성적이 저장되었습니다.\n",list.size());
				System.out.println();
			}
			else
			{
				isloop=false;
			}
		
			
		}// while
		

	}//setStudent()
	
	
	
	void getAllStudents()
	{

		var a=0;
		System.out.println("[ 학생 성적 출력 ]");	
		System.out.println("------------------------------------------------------------");
		for(int i = 0 ; i < title.length ; i++)
		{
			
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			StuScore stu = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",stu.getStuNo(),stu.getName(),
					stu.getKor(),stu.getEng(),stu.getMath(), stu.getTotal(), stu.getAvg(),stu.getRank());
		}

		System.out.println();
		System.out.println();
		
		
	}// getAllStudents()
	
	
}//class
