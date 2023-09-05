package p0901;

import java.util.Scanner;

class Students{
	
	String name;
	int number;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	Students()
	{
		name="";
		number = 0;
		kor = 0;
		eng = 0;
		math = 0;
		total = 0;
		avg = 0;
	}
	
	void get()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요.");
		while(!scan.hasNextInt()){scan.nextLine();}
		number = scan.nextInt();
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		System.out.println("국어 점수를 입력하세요.");
		while(!scan.hasNextInt()){scan.nextLine();}
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		while(!scan.hasNextInt()){scan.nextLine();}
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		while(!scan.hasNextInt()){scan.nextLine();}
		math = scan.nextInt();
		
		total = kor + eng + math;
		avg = (double)total/3.0;
		
	}
	
	void print()
	{
		System.out.println("[학생성적프로그램]");
		System.out.println("-------------");
		System.out.println("번호 : " + number);
		System.out.println("이름 : " + name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.2f\n", avg);
	}

}

public class JA0901_01 {
	


	public static void main(String[] args) {
		
		int MAX = 4;
		
		Students[] persons = new Students[MAX];


		for(int i = 0 ; i < MAX ;i++)
		{
			persons[i] = new Students();
		}
		
		for(int i = 0 ; i < MAX ;i++)
		{
			persons[i].get();
		}
		
		for(int i = 0 ; i < MAX ; i++)
		{
			persons[i].print();
		}
		
//		Students person1 = new Students();
//		Students person2 = new Students();
//		
//		person1.get();
//		person2.get();
//		
//		person1.print();
//		person2.print();
//		try (Scanner scan = new Scanner(System.in)) {
//			String name = "";
//			
//			int number = 0;
//			int kor = 0;
//			int eng = 0;
//			int math = 0;
//			int total = 0;
//			double avg = 0;
//			
//			String name2 = "";
//			
//			int number2 = 0;
//			int kor2 = 0;
//			int eng2 = 0;
//			int math2 = 0;
//			int total2 = 0;
//			double avg2 = 0;
//			
////		number = 1 ;
////		name = "홍길동";
////		kor = 100;
////		eng = 100;
////		math = 100;
////		total = kor + eng + math;
////		avg = (double)total/3.0;
//			
//			System.out.println("학번을 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			number = scan.nextInt();
//			System.out.println("이름을 입력하세요.");
//			name = scan.next();
//			System.out.println("국어 점수를 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			kor = scan.nextInt();
//			System.out.println("영어 점수를 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			eng = scan.nextInt();
//			System.out.println("수학 점수를 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			math = scan.nextInt();
//			
//			total = kor + eng + math;
//			avg = (double)total/3.0;
//			
//			System.out.println("[학생성적프로그램]");
//			System.out.println("-------------");
//			System.out.println("번호 : " + number);
//			System.out.println("이름 : " + name);
//			System.out.println("국어 : "+kor);
//			System.out.println("영어 : "+eng);
//			System.out.println("수학 : "+math);
//			System.out.println("합계 : "+total);
//			System.out.printf("평균 : %.2f\n", avg);
//			
//			System.out.println("학번을 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			number2 = scan.nextInt();
//			System.out.println("이름을 입력하세요.");
//			name2 = scan.next();
//			System.out.println("국어 점수를 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			kor2 = scan.nextInt();
//			System.out.println("영어 점수를 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			eng2 = scan.nextInt();
//			System.out.println("수학 점수를 입력하세요.");
//			while(!scan.hasNextInt()){scan.nextLine();}
//			math2 = scan.nextInt();
//			
//			total2 = kor + eng + math;
//			avg2 = (double)total/3.0;
//			
//			System.out.println("[학생성적프로그램]");
//			System.out.println("-------------");
//			System.out.printf("번호 : %d \t" , number2);
//			System.out.printf("이름 : %s \t" , name2);
//			System.out.printf("국어 : %d \t",kor2);
//			System.out.printf("영어 : %d \t",eng2);
//			System.out.printf("수학 : %d \t",math2);
//			System.out.printf("합계 : %d\t",total2);
//			System.out.printf("평균 : %.2f\n", avg2);
//			
//		}
	}

}
