package p0922;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {

	ArrayList<StuScore> list = new ArrayList<StuScore>();

	
	void stuInput()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		while(isloop)
		{
			int count = list.size()+1;
			System.out.println("[[ 학생성적 입력 ]]");
			System.out.print(count+"번째 학생이름을 입력하세요.(0. 이전페이지 이동)>> ");
			String name = scan.next();
			if(name.equals("0"))
			{
				isloop = false;
			}
			else
			{
				System.out.print("국어성적을 입력하세요");
				int kor = scan.nextInt();
				System.out.print("영어성적을 입력하세요");
				int eng = scan.nextInt();
				System.out.print("수학성적을 입력하세요");
				int math = scan.nextInt();
				
				list.add(new StuScore(name, kor,eng,math));
				System.out.println("학생성적이 저장되었습니다.");
				System.out.println();
			}
			
		}//while
	}// stuInput()
	
	
	void showScore()
	{
	//	String[] title = {학번,이름,국어,영어,수학,합계,평균,등수};
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0 ; i < list.size() ; i++)
		{
			StuScore s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
	}//showScore()
	
	void getFile()
	{
		try {
			FileReader fr = new FileReader("C:/aaa/stu1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line!=null)
			{
				
				String[] data  = line.split(",");

				line = br.readLine();
				
				int stuNum = Integer.parseInt(data[0]);

				int kor = Integer.parseInt(data[2]);
				int eng = Integer.parseInt(data[3]);
				int math = Integer.parseInt(data[4]);
				int total = Integer.parseInt(data[5]);
				double avg = Double.parseDouble(data[6]);
				int rank = Integer.parseInt(data[4]);
				list.add(new StuScore(stuNum,data[1],kor,eng,math,total,avg,rank));
			}
			
			br.close();
			fr.close();
			
			System.out.println(" 저장된 파일을 가져왔습니다. \n");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void saveFile()//list내의 정보 csv 양식으로 저장
	{
		FileWriter fw;
		try {
			fw = new FileWriter("C:/aaa/stu1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0 ; i < list.size() ; i++)
			{
				StuScore s = list.get(i);
				bw.write(String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank()));
			}
			
			bw.close();
			fw.close();
			System.out.println("학생성적을 파일에 저장했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	void sortData()
	{
		
	}
	
	void stuTotalSort()//성적 높은 순 정렬
	{
		Collections.sort(list,new Comparator<StuScore>() {

			@Override
			public int compare(StuScore o1, StuScore o2) {
				// TODO Auto-generated method stub
				return o1.getTotal() > o2.getTotal() ? -1 : 1;
			}
			
		});
		
		System.out.println("성적이 높은 순정렬이 완료되었습니다.");
		
	}
	
	void stuTotalSort2() // 성적 낮은순 정렬
	{
		Collections.sort(list,new Comparator<StuScore>() {

			@Override
			public int compare(StuScore o1, StuScore o2) {
				// TODO Auto-generated method stub
				return o1.getTotal() < o2.getTotal() ? -1 : 1;
			}
			
		});
		
		System.out.println("성적이 낮은 순정렬이 완료되었습니다.");
	}//stuTotalSort2
	
	void stuNameSort() //이름순 정렬 
	{
		Collections.sort(list,new Comparator<StuScore>() {

			@Override
			public int compare(StuScore o1, StuScore o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
	}//stuNameSort
	
	void stuUpdate()
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> found = new ArrayList();
		boolean isloop = true;
		int choice = 0;
		StuScore s = null;
		
		
		System.out.println("[[ 학생 성적 수정 ]]");
		while(isloop)
		{

			System.out.println("수정할 학생 이름을 입력하세요(0.이전메뉴) >> ");
			String Input = scan.next();
			if(Input.equals("0"))
			{
				break;
			}
			
			for(int i = 0 ; i < list.size() ; i++)
			{
				if(list.get(i).getName().equals(Input))
				{
					found.add(list.get(i));
				}
				
			}
			
			
			if(found.size() == 0)
			{
				System.out.println("찾는 학생이 없습니다. 다시 검색하세요 ");
				continue;
			}
			

			else if(found.size() > 1 )
			{
				System.out.println("동일 이름이 검색되었습니다. 해당하는 학생을 다시 선택해주세요>>");
				for(int i = 0 ; i < found.size(); i ++)
				{
					
					System.out.println((i+1)+". 학번 : "+found.get(i).getStuNum()+"이름: "+found.get(i).getName());
				}
				choice = scan.nextInt();
				
				s = found.get(choice-1);
			}
			else
			{
				s = found.get(0);
			}

			System.out.println();
			System.out.println("--------------------------");
			
			System.out.println("1. 국어 점수");
			System.out.println("2. 영어 점수");
			System.out.println("3. 수학 점수");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("[[ 국어점수 수정 ]]");
				System.out.println("--------------------------");
				System.out.println("● 현재 점수 >> " + s.getKor());
				System.out.println("변경할 국어점수를 입력하세요 >> ");
				s.setKor(scan.nextInt());
				break;
			case 2 : 
				System.out.println("[[ 영어점수 수정 ]]");
				System.out.println("--------------------------");
				System.out.println("● 현재 점수 >> " + s.getEng());
				System.out.println("변경할 영어점수를 입력하세요 >> ");
				s.setEng(scan.nextInt());
				break;
			case 3 : 
				System.out.println("[[ 영어점수 수정 ]]");
				System.out.println("--------------------------");
				System.out.println("● 현재 점수 >> " + s.getKor());
				System.out.println("변경할 수학점수를 입력하세요 >> ");
				s.setKor(scan.nextInt());
				break;
			}
			
		}//while
	}// stuUpdate
	
	void stuRank()
	{
		//현재 랭크 리셋
		for(int i = 0 ; i < list.size() ; i++)
		{
			list.get(i).setRank(1);
		}
		
		//랭크 계산
		for(int i = 0 ; i < list.size() ; i++)
		{
			for(int j = 0 ; j < list.size(); j++)
			{
				if(list.get(i).getTotal()>list.get(j).getTotal())
				{
					list.get(j).setRank(list.get(j).getRank()+1);
				}
			}
		}
		
		System.out.println("등수처리가 완료되었습니다.\n");
	}//void stuRank()
	
	void stuDelete()
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> found = new ArrayList();
		boolean isloop = true;
		int choice = 0;
		StuScore s = null;
		
		
		System.out.println("[[ 학생성적 삭제 ]]");
		while(isloop)
		{

			System.out.println("삭제할 학생 이름을 입력하세요(0.이전메뉴) >> ");
			String Input = scan.next();
			if(Input.equals("0"))
			{
				break;
			}
			
			for(int i = 0 ; i < list.size() ; i++)
			{
				if(list.get(i).getName().equals(Input))
				{
					found.add(list.get(i));
				}
				
			}
			
			
			if(found.size() == 0)
			{
				System.out.println("찾는 학생이 없습니다. 다시 검색하세요 ");
				continue;
			}
			else if(found.size() > 1 )
			{
				System.out.println("동일 이름이 검색되었습니다. 해당하는 학생을 다시 선택해주세요>>");
				for(int i = 0 ; i < found.size(); i ++)
				{
					
					System.out.println((i+1)+". 학번 : "+found.get(i).getStuNum()+"이름: "+found.get(i).getName());
				}
				choice = scan.nextInt();
				
				s = found.get(choice-1);
			}
			else
			{
				s = found.get(0);
			}
			
			
			System.out.println("삭제하시겠습니까? (1. 삭제)");
			choice = scan.nextInt();
			
			if(choice ==1)
			{
				list.remove(s);
				System.out.println(Input + "학생성적이 삭제되었습니다.");
			}else
			{
				System.out.println(Input + "학생성적 삭제가 취소되었습니다.");
			}
		}//while
		

		
		
	}//void stuDelete()
	
}
