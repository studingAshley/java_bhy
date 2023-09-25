package p0925;

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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    [ 인스턴스 변수 ]
	ArrayList<StuScore> list = new ArrayList<StuScore>();
	
	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	


	public StuAction() {
	
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void stuPut()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		String input="";
		int kor = 0, eng = 0, math = 0;
		
		while(isloop)
		{
			System.out.println(" [ 학생 성적 입력 ] ");
			System.out.println("학생의 이름을 입력하세요 (0. 이전 메뉴)");
			input = scan.next();
			
			if(input.equals("0"))
			{
				return;
			}
			System.out.print("국어 성적을 입력하세요 >> ");
			kor = scan.nextInt();
			System.out.print("영어 성적을 입력하세요 >> ");
			eng = scan.nextInt();
			System.out.print("수학 성적을 입력하세요 >> ");
			math = scan.nextInt();
			
			list.add(new StuScore(input,kor,eng,math));
			
			System.out.println("입력이 완료되었습니다.\n");
			
			
			
		}//while
		
	}//stuPut()

	void stuPrint()
	{
		System.out.println("[ 학생성적 출력 ]");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------------------------");
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getStuNum(),list.get(i).getName(), list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath(), list.get(i).getTotal(),
					list.get(i).getAvg(), list.get(i).getRank());
		}
		
		System.out.println();
	}//stuPrint()
	
	void stuUpdate()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		String input="";
		int kor = 0, eng = 0, math = 0;
		ArrayList<StuScore> found = new ArrayList<StuScore>();
		StuScore update = null;
		
		while(isloop)
		{
			System.out.println(" [ 학생성적 수정 ]");
			System.out.println("수정할 학생의 이름을 입력하세요.(0. 이전메뉴)");
			input = scan.next();
			
			if(input.equals("0"))
			{
				return;
			}
			
			for(int i = 0 ; i < list.size() ; i++) 
			{
				StuScore s = list.get(i);
				if(input.equals(s.getName()))
				{
					found.add(s);
				}
			}// 전체 학생 검색
			
			if(found.size() ==0 )//검색된 학생 없음
			{
				System.out.println("검색 결과가 없습니다. 다시 입력해주세요.\n");
				/////////////[ 반복문 밖 지역 변수 초기화 ]
				found.clear();
				input="";
				kor = 0;
				eng = 0;
				math = 0;
				update = null;
				continue;
			}
			else if(found.size()>1) //동명이인 존재
			{
				System.out.println("검색결과가 두개 이상입니다. 해당하는 학생을 선택해주세요");
				
				for(int i = 0 ; i < found.size() ; i++)
				{
					System.out.println((i+1)+"학번 : "+found.get(i).getStuNum()+", 이름 : "+ found.get(i).getName());
				}
				
				int choice = scan.nextInt();
				if((choice > 0) && choice <= found.size())
				{
					update = found.get(choice-1);
				}
				else
				{
					System.out.println("잘 못 선택하였습니다. 다시 시도해주세요");
					/////////////[ 반복문 밖 지역 변수 초기화 ]
					found.clear();
					input="";
					kor = 0;
					eng = 0;
					math = 0;
					update = null;
					continue;
				}
			}
			else//검색결과 한개
			{
				update = found.get(0);
				System.out.print("검색결과 : ");
				System.out.printf("학번 : %d, 이름 : %s\n",update.getStuNum(), update.getName());
			}
			
			System.out.println("변경할 성적을 선택하세요");
			System.out.println("-------------------------");
			System.out.println("1. 국어 성적");
			System.out.println("2. 영어 성적");
			System.out.println("3. 수학 성적");
			System.out.println("-------------------------");
			
			int choice = scan.nextInt();
			
			if(choice == 1 ) //국어
			{
				System.out.printf("국어성적을 입력하세요 >> ");
				update.setKor(scan.nextInt());
			}
			else if (choice == 2) // 영어
			{
				System.out.printf("영어성적을 입력하세요 >> ");
				update.setEng(scan.nextInt());
			}
			else if(choice == 3) //수학
			{
				System.out.printf("수학성적을 입력하세요 >> ");
				update.setMath(scan.nextInt());
			}
			else
			{
				//
			}
			
			System.out.println("성적수정이 완료되었습니다.\n\n");
			
			/////////////[ 반복문 밖 지역 변수 초기화 ]
			found.clear();
			input="";
			kor = 0;
			eng = 0;
			math = 0;
			update = null;
		}//while
	}//stuUpdate()
	
	
	void stuDelete()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		String input="";
		int kor = 0, eng = 0, math = 0;
		ArrayList<StuScore> found = new ArrayList<StuScore>();
		StuScore update = null;
		
		while(isloop)
		{
			System.out.println(" [ 학생성적 수정 ]");
			System.out.println("수정할 학생의 이름을 입력하세요.(0. 이전메뉴)");
			input = scan.next();
			
			if(input.equals("0"))
			{
				return;
			}
			
			for(int i = 0 ; i < list.size() ; i++) 
			{
				StuScore s = list.get(i);
				if(input.equals(s.getName()))
				{
					found.add(s);
				}
			}// 전체 학생 검색
			
			if(found.size() ==0 )//검색된 학생 없음
			{
				System.out.println("검색 결과가 없습니다. 다시 입력해주세요.\n");
				/////////////[ 반복문 밖 지역 변수 초기화 ]
				found.clear();
				input="";
				kor = 0;
				eng = 0;
				math = 0;
				update = null;
				continue;
			}
			else if(found.size()>1) //동명이인 존재
			{
				System.out.println("검색결과가 두개 이상입니다. 해당하는 학생을 선택해주세요");
				
				for(int i = 0 ; i < found.size() ; i++)
				{
					System.out.println((i+1)+". 학번 : "+found.get(i).getStuNum()+", 이름 : "+ found.get(i).getName());
				}
				
				int choice = scan.nextInt();
				if((choice > 0) && choice <= found.size())
				{
					update = found.get(choice-1);
				}
				else
				{
					System.out.println("잘 못 선택하였습니다. 다시 시도해주세요");
					/////////////[ 반복문 밖 지역 변수 초기화 ]
					found.clear();
					input="";
					kor = 0;
					eng = 0;
					math = 0;
					update = null;
					continue;
					
				}
			}
			else//검색결과 한개
			{
				update = found.get(0);
				System.out.print("검색결과 : ");
				System.out.printf("학번 : %d, 이름 : %s\n",update.getStuNum(), update.getName());
			}
			
			System.out.println("삭제하시겠습니까?");
			System.out.println("-------------------------");
			System.out.println("1. 삭제");

			int choice = scan.nextInt();
			
			if(choice == 1 ) //국어
			{
				list.remove(update);
				System.out.println("삭제가 완료되었습니다.\n\n");
			}
			else 
			{
				System.out.println("삭제가 취소되었습니다.\n\n");
			}
			

			
			/////////////[ 반복문 밖 지역 변수 초기화 ]
			found.clear();
			input="";
			kor = 0;
			eng = 0;
			math = 0;
			update = null;
		}
	}
	
	void stuSortName()
	{
		Collections.sort(list, new Comparator<StuScore>() {

			@Override
			public int compare(StuScore o1, StuScore o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("이름 순으로 정렬 완료\n");
	}
	
	void stuSortTotalHigh()
	{
		Collections.sort(list, new Comparator<StuScore>() {

			@Override
			public int compare(StuScore o1, StuScore o2) {
				// TODO Auto-generated method stub
				return o1.getTotal() < o2.getTotal() ? 1 : -1;
			}
		});
		System.out.println("성적 높은 순으로 정렬 완료\n");
	}
	
	void stuSortTotalLow()
	{

		Collections.sort(list, new Comparator<StuScore>() {

			@Override
			public int compare(StuScore o1, StuScore o2) {
				// TODO Auto-generated method stub
				return o1.getTotal() > o2.getTotal() ? 1 : -1;
			}
		});
		System.out.println("성적 낮은 순으로 정렬 완료\n");
	}
	
	void stuGetFile()
	{
		FileReader fr;
		try {
			fr = new FileReader("C:/aaa/stu1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line =	br.readLine();
			
			System.out.println("파일을 읽어오는 중 ...");
			while(line != null)
			{
				String[] splitData = line.split(",");
				int stuNum = Integer.parseInt(splitData[0]);
				int kor = Integer.parseInt(splitData[2]);
				int eng = Integer.parseInt(splitData[3]);
				int math = Integer.parseInt(splitData[4]);
				int total = Integer.parseInt(splitData[5]);
				double avg = Double.parseDouble(splitData[6]);
				int rank = Integer.parseInt(splitData[7]);
				list.add(new StuScore(stuNum,splitData[1],kor,eng,math,total,avg,rank));
				
				line =	br.readLine();//다음줄의 데이터 읽어오기
			}
			
			br.close();
			fr.close();
			
			System.out.println("파일 읽기가 완료되었습니다.\n");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			e.printStackTrace();
		}

	} //stuGetFile()

	void stuPutFile()
	{
		try {
			FileWriter fw = new FileWriter("C:/aaa/stu1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("성적 데이터를 파일에 저장 중 ...");
			for(int i = 0 ; i < list.size() ; i++)
			{
				bw.write(String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",list.get(i).getStuNum(),list.get(i).getName(),list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath(),
						list.get(i).getTotal(), list.get(i).getAvg(), list.get(i).getRank()));
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("저장이 완료되었습니다.\n");
		
	} // stuPutFile()
	
	void sutSetRank()
	{
		for(int i = 0 ; i < list.size() ; i++) //랭크데이터 리셋
		{
			list.get(i).setRank(1);
		}
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			int count = 1;
			for(int j = 0 ; j < list.size() ; j++)
			{
				if(list.get(i).getTotal()<list.get(j).getTotal())
				{
					count++;
				}
			}
			list.get(i).setRank(count);
		}
	}
	
}
