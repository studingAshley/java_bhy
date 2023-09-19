package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	
	private ArrayList<StuScore> list = new ArrayList<StuScore>();
	private  String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	
	StuAction()
	{
		
	}
	
	void printMain()
	{
		System.out.println("---------------------------");
		System.out.println("   [ 학생 성적 프로그램 ]");
		System.out.println("---------------------------");
		System.out.println("1. 학생입력");
		System.out.println("2. 학생출력");
		System.out.println("3. 학생수정");
		System.out.println("4. 학생삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("원하는 메뉴를 입력하세요");
	}
	
	void addStudents()
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int kor = 0 , eng = 0, math = 0;
		boolean isloop = true;
	
		while(isloop)
		{
			System.out.println("---------------------------");
			System.out.println("       [ 학생 입력 ]");
			System.out.println("---------------------------");
			System.out.println((list.size()+1)+"번째 학생의 이름을 입력하세요(0. 이전 메뉴로 이동)");
			name = scan.next();
			
			if(name.equals("0"))
			{
				System.out.println("이전 메뉴로 이동합니다.");
				System.out.println();
				return;
			}
			
			System.out.println("국어 점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			math = scan.nextInt();
			
			list.add(new StuScore(name,kor,eng,math)); // 새로운 학생 정보 추가
			
			System.out.println();
			System.out.println();
			
		}
		

		
	}
	
	void printStudents()
	{
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                         [ 학생 출력 ]");
		System.out.println("-------------------------------------------------------------------");
		
		for(int i = 0 ; i < title.length ; i++)
		{
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getStuNum(), list.get(i).getName(),
					list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(), list.get(i).getRank());
		}
		
	}
	
	void modifyStudents()
	{
		Scanner scan = new Scanner(System.in);
		String selStu = "";
		
		ArrayList<StuScore> found = new ArrayList<StuScore>();
		StuScore selected = null;
		
		
		System.out.println("---------------------------");
		System.out.println("       [ 학생 수정 ]");
		System.out.println("---------------------------");
		System.out.println("수정을 원하는 학생의 이름 또는 학번을 입력하세요 (0. 이전메뉴로 이동)");
		selStu = scan.next();
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			//if(selStu.equals(list.get))
		}
		
		
	}
	
	void deleteStudents()
	{
		
	}
	
	void searchStudents()
	{
		
	}
	
	void setRank()
	{
		
	}
	
	

}
