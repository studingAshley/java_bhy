package p0915_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	
	private ArrayList<StuScore> list = new ArrayList<StuScore>();
	private final String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	
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
	
	void modifyData()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		ArrayList<StuScore> found = new ArrayList<StuScore>();
		StuScore s = null;
		

		
		while(isloop)
		{
			
			System.out.println("[ 학생 성적 수정 ]");
			
			System.out.println("검색을 원하는 학생의 학번 또는 이름을 입력하세요(0.이전 메뉴로 돌아가기)");
			String search = scan.next();
			
			if(!search.equals("0"))
			{
				for(int i = 0 ; i < list.size() ; i++)
				{
					s = list.get(i);
					if(search.equals(s.getName())|| search.equals( String.format("%d", s.getStuNo())))
					{
						//System.out.println("학번 : "+s.getStuNo()+", 이름 : "+s.getName());
						found.add(s);
					}
					
				}
			}
			else
			{
				System.out.println("초기메뉴로 이동");
				return;
			}
			
			if(1<found.size())
			{
				isloop = false;
				System.out.println("중복되는 데이터가 있음. 다음 중 원하는 데이터 선택");
				for(int i = 0 ; i < found.size(); i++)
				{
					System.out.println((i+1)+". 학번 : " + found.get(i).getStuNo()+" 이름 : "+found.get(i).getName());
				} //for //중복데이터가 있을 경우 출력 
				
				int choice = scan.nextInt();
				if(choice <= found.size())
				{
					s = found.get(choice-1);
				}
				else
				{
					System.out.println("잘못된 번호 선택. 초기 메뉴로 이동");
					return;
				}
			}
			else if(0 == found.size())
			{
				System.out.println("※찾고자 하는 "+ search +"데이터 없음. 다시 입력하세요.");
				System.out.println();
				
				
			}
			else
			{
				isloop = false;
				s = found.get(0);
			}
			
		}//while // 일치하는 데이터 검색
		
		System.out.println("학번 : "+ s.getStuNo() +", 이름 :" +s.getName()+"학생이 선택되었습니다.");
		System.out.println();
		System.out.println("[ 수정 과목 선택 ]");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1 : 
			System.out.println("[ 국어점수 수정 ]");
			System.out.println("현재점수 : "+s.getKor());
			System.out.println("변경할 점수를 입력하세요 ");
			s.setKor(scan.nextInt());
			System.out.println("국어점수가 변경되었습니다.");
			break;
		case 2 :
			System.out.println("[ 영어점수 수정 ]");
			System.out.println("현재점수 : "+s.getEng());
			System.out.println("변경할 점수를 입력하세요 ");
			s.setEng(scan.nextInt());
			System.out.println("영어점수가 변경되었습니다.");
			break;
		case 3 :
			System.out.println("[ 수학점수 수정 ]");
			System.out.println("현재점수 : "+s.getMath());
			System.out.println("변경할 점수를 입력하세요 ");
			s.setMath(scan.nextInt());
			System.out.println("수학점수가 변경되었습니다.");
			break;
			
		}//switch
		
		
	}// modifyData()
	
	void deleteData()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		boolean isfind = false;
		ArrayList<StuScore> found = new ArrayList<StuScore>();
		StuScore s = null;
		String search ="";

		
		while(isloop)
		{
			
			System.out.println("[ 학생 성적 삭제 ]");
			
			System.out.println("삭제를 원하는 학생의 학번 또는 이름을 입력하세요(0.이전 메뉴로 돌아가기)");
			search = scan.next();
			
			if(!search.equals("0"))
			{
				for(int i = 0 ; i < list.size() ; i++)
				{
					s = list.get(i);
					if(search.equals(s.getName())|| search.equals( String.format("%d", s.getStuNo())))
					{
						//System.out.println("학번 : "+s.getStuNo()+", 이름 : "+s.getName());
						isfind = true;
						found.add(s);
					}
					
				}
			}
			else
			{
				System.out.println("초기메뉴로 이동");
				return;
			}
			
			if(1<found.size())
			{
				System.out.println("중복되는 데이터가 있음. 다음 중 원하는 데이터 선택");
				for(int i = 0 ; i < found.size(); i++)
				{
					System.out.println((i+1)+". 학번 : " + found.get(i).getStuNo()+" 이름 : "+found.get(i).getName());
				}
				int choice = scan.nextInt();
				if(choice <= found.size())
				{
					s = found.get(choice-1);
				}
				else
				{
					System.out.println("잘못된 번호 선택. 초기 메뉴로 이동");
					return;
				}
			}
			else if(0 == found.size())
			{
				System.out.println("※찾고자 하는 "+ search +"데이터 없음. 다시 입력하세요.");
				System.out.println();
				isfind=false;
				
			}
			else
			{
				
				s = found.get(0);
			}
			
			if(isfind)
			{
				isloop = true;
				System.out.println("삭제하려면 1을 누르세요");
				System.out.println("선택된 데이터 : 학번 : "+s.getStuNo()+", 이름 : "+s.getName());
				
				int choice = scan.nextInt();
				
				if(choice == 1)
				{
					list.remove(s);
					System.out.println(search + " 학생의 정보가 삭제되었습니다.");
				}
				else
				{
					System.out.println("삭제가 취소되었습니다. 초기 메뉴로 돌아갑니다.");
					return;
				}

			}
			
			found.removeAll(found);
		}//while
	}// deleteData()

	
	void searchStudents()
	{
		Scanner scan = new Scanner(System.in);
		boolean isloop = true;
		boolean isfind = false;
		ArrayList<StuScore> found = new ArrayList<StuScore>();
		StuScore s = null;
		String search ="";

		
		while(isloop)
		{
			
			System.out.println("[ 학생 검색 ]");
			
			System.out.println("학생의 학번 또는 이름을 입력하세요(0.이전 메뉴로 돌아가기)");
			search = scan.next();
			
			if(!search.equals("0"))
			{
				for(int i = 0 ; i < list.size() ; i++)
				{
					s = list.get(i);
					if(search.equals(s.getName())|| search.equals( String.format("%d", s.getStuNo())))
					{
						//System.out.println("학번 : "+s.getStuNo()+", 이름 : "+s.getName());
						isfind = true;
						found.add(s);
					}
					
				}
			}
			else
			{
				System.out.println("초기메뉴로 이동");
				return;
			}
			
			if(0<found.size())
			{
				System.out.println("[검색 결과]");
				System.out.println("------------------------------------------------------------");
				for(int i = 0 ; i < title.length ; i++)
				{
					
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				
				for(int i = 0 ; i < found.size() ; i++)
				{
					StuScore stu = found.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",stu.getStuNo(),stu.getName(),
							stu.getKor(),stu.getEng(),stu.getMath(), stu.getTotal(), stu.getAvg(),stu.getRank());
				}

	
			}
			else
			{
				System.out.println("검색 결과 없음");
			}//if(0<found.size())
			
			System.out.println();
			found.removeAll(found);
		}//while
	}// getAStudent()
		
	void sortList()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("[ 등수 처리 ]");
		System.out.println("등수 처리를 진행하시겠습니까?");
		System.out.println("1. 예");
//		System.out.println("2. 아니오");
		System.out.println("0. 아니오(이전페이지 이동)");
		
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 0 :
			System.out.println("이전 페이지로 이동합니다.");
			System.out.println();
			break;
		case 1 : 
			System.out.println("등수 처리 중 ...");
			for(int i = 0 ; i < list.size() ; i++)
			{
				int count = 1 ;
				for(int j = 0 ; j < list.size() ; j++)
				{
					if(list.get(i).getTotal() < list.get(j).getTotal())
					{
						count++;
					}
					
				}
				
				list.get(i).setRank(count);
			}
			
			
			break;
		}

		
		System.out.println("등수 처리 완료");
	}
}//class
