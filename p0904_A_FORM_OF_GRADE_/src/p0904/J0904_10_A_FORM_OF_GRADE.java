package p0904;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J0904_10_A_FORM_OF_GRADE {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		system file1 = new system();
		
		Scanner scan = new Scanner(System.in);
		int choice = 0 ; 
		
		System.out.println("[학생성적 프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("7. 순차정렬");
		System.out.println("8. 역순정렬");
		System.out.println("9. 종료");
		System.out.println("--------------");
		
		System.out.print("원하는 번호를 입력하세요.>>");
		
		choice = scan.nextInt();
		
		int i[]= {0,1,2};

		System.out.println(""+i[0]+i[1]+i[2]);
		
		file1.add_student("NAME", 1030);
		file1.add_student("NAME2", 1040);
		file1.add_student("NAME3", 1050);
		

		student std = new student();
		
		std.set_name("TestNameStd");
		file1.add_student("TestName2File", 1010);
		
		System.out.println(std.get_name());
		System.out.println(std.toString());
		
		file1.temp(std);
		
		switch(choice)
		{
			case 1 : 
			{
				System.out.println("성적입력을 선택하셨습니다.");
				break;
			}
			case 2 : 
			{
				System.out.println("성적출력을 선택하셨습니다.");
				break;
		
			}
			case 3 : 
			{
				System.out.println("성적수정을 선택하셨습니다.");
				break;
			}
			case 4 : 
			{
				System.out.println("성적삭제를 선택하셨습니다.");
				break;
			}
			case 5 :
			{
				System.out.println("학생검색을 선택하셨습니다.");
				break;
			}
			case 6 :
			{
				System.out.println("등수처리를 선택하셨습니다.");
				break;
			}
			case 7 :
			{
				System.out.println("순차정렬을 선택하셨습니다.");
				break;
			}
			case 8 :
			{
				System.out.println("역순정렬을 선택하셨습니다.");
				break;
			}
				
		}
	
	}

	void insert(student std)
	{
		
	
		System.out.println("");
		
	}
	void printAll()
	{
		
	}
	
	void modification()
	{
		
	}
	
	void delete()
	{
		
	}
	
	void search()
	{
		
	}
	
	void sort()
	{
		
	}
}

class student
{
	private String name;
	private int studentNumber;
	private int kor,eng,math;
	//=================================================================	
	student()
	{
		name = "";
		studentNumber = 0;
		kor = 0;
		eng = 0;
		math = 0;
	}
	student(String name, int studentNumber)
	{
		this();
		this.name = name;
		this.studentNumber = studentNumber;
	}
	student(String name, int studentNumber, int kor, int eng, int math)
	{
		this();
		this.studentNumber = studentNumber;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//=================================================================
	String get_name()
	{
		return this.name;
	}
	int get_studentNumber()
	{
		return this.studentNumber;
	}
	int get_kor()
	{
		return this.kor;
	}
	int get_eng()
	{
		return this.eng;
	}
	int get_math()
	{
		return this.math;
	}
	//=================================================================
	void set_name(String name)
	{
		this.name = name;
	}
	void set_studentNumber(int studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	void set_kor(int kor)
	{
		this.kor = kor;
	}
	void set_eng(int eng)
	{
		this.eng = eng;
	}
	void set_math(int math)
	{
		this.math = math;
	}
}


class system // 추가, 출력, 수정, 삭제, 검색, 등수부여, 정렬
{

	private List<student> data = new ArrayList<student>();
	
	system()
	{
		
	}
	//=================================================================
	void add_student(String name, int studentNumber)
	{
		student tempstd = new student(name, studentNumber);
		data.add(tempstd);
	}
	//=================================================================
	//=================================================================
	boolean set_score_kor(String name, int sc)
	{
		int index = get_index(name);
		if(index != -1)
		{
			data.get(index).set_kor(sc); 
			return true;
		}
		return false;
		
	}
	boolean set_score_eng(String name, int sc)
	{
		int index = get_index(name);
		if(index != -1)
		{
			data.get(index).set_eng(sc);
			return true;
		}
		return false;
	}
	boolean set_score_math(String name, int sc)
	{
		int index = get_index(name);
		if(index != -1)
		{
			data.get(index).set_math(sc);	
			return true;
		}
		return false;
	}
	//=================================================================
	boolean set_score_kor(int studentnum, int sc)
	{
		int index = get_index(studentnum);
		if(index != -1)
		{
			data.get(index).set_kor(sc);	
			return true;
		}
		return false;
	}
	boolean set_score_eng(int studentnum, int sc)
	{
		int index = get_index(studentnum);
		if(index != -1)
		{
			data.get(index).set_eng(sc);	
			return true;
		}
		return false;
	}
	boolean set_score_math(int studentnum, int sc)
	{
		int index = get_index(studentnum);
		if(index != -1)
		{
			data.get(index).set_math(sc);	
			return true;
		}
		return false;
	}
	
	//=================================================================
	//=================================================================
	
	int get_index(String name)
	{
		int size = data.size();
		for (int i = 0 ; i < size ; i++)
		{
			if(data.get(i).get_name().equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	int get_index(int studentNumber)
	{
		int size = data.size();
		for (int i = 0 ; i < size ; i++)
		{
			if(data.get(i).get_studentNumber() == i)
			{
				return i;
			}
		}
		return -1;
	}
	
	void temp(student std)
	{
		data.add(std);
		System.out.println(std.toString());
	}
	
}



