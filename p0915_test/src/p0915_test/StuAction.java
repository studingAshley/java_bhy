package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {

	private ArrayList<StuScore> list = new ArrayList<StuScore>();
	private String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};

	StuAction()
	{
		//
	}
	
	
	int printMain()
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
		System.out.println("원하는 번호를 입력하세요");
		
		return scan.nextInt();
	}
	
	void setStudents()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		
		System.out.println("[ 학생 입력 ]");
		while(isloop)
		{
			System.out.println("이름을 입력하세요(0.이전 메뉴로 돌아가기)");
			String name = scan.next();
			if(!name.equals("0"))
			{
				System.out.println("국어점수를 입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요");
				int math = scan.nextInt();
				System.out.println();
				
				list.add(new StuScore(name,kor,eng,math));
			}
			else
			{
				isloop = false;
			}
			
			System.out.println();
		}//while
	}//setStudents()
	
	void printAllStudents()
	{
		System.out.println("[ 학생 출력 ]");
		System.out.println("--------------------------------------------------------------");
		for(int i = 0 ; i < title.length ; i++)
		{
			System.out.printf("%s\t",title[i]);			
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getStuNum(),
					list.get(i).getName(), list.get(i).getKor(), list.get(i).getEng(),
					list.get(i).getMath(), list.get(i).getTotal(), list.get(i).getAvg(),
					list.get(i).getRank());
		}
		
		System.out.println();
		System.out.println();
	}
	
	void modifyData()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 학생 성적 수정 ]");
		
		System.out.println("검색을 원하는 학생의 학번 또는 이름을 입력하세요(0.이전 메뉴로 돌아가기)");
		String search = scan.next();
		
		if(!search.equals("0"))
		{
			for(int i = 0 ; i < list.size() ; i++)
			{
				StuScore s = list.get(i);
				if(search.equals(s.getName())|| search.equals( String.format("%d", s.getStuNum())))
				{
					System.out.println("아아 ~ 잘 찾아지는가 ? "+s.getName());
				}
			}
		}
		else
		{
			//
		}
	}
	
}//class
