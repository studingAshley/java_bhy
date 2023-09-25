package p0922;

import java.util.ArrayList;

public class J0922_01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		list.add(new StuScore("홍길동",100,100,99));
		list.add(new StuScore("유관순",90,90,91));
		list.add(new StuScore("이순신",88,83,80));
		list.add(new StuScore("강감찬",88,83,80));
		list.add(new StuScore("김구",88,83,80));
		
		
		System.out.println("[ 성적처리 프로그램 ]");
		System.out.println("---------------------------------------------------------------------------");
		for(int i = 0 ; i < title.length ; i++)
		{
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		for(int i = 0 ; i < list.size() ; i++)
		{	
			StuScore s = (StuScore) list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getStuNum(), s.getName(), s.getKor(), s.getEng(), s.getMath() ,s.getTotal(), s.getAvg() ,s.getRank());
		}
	}

}
