package p0831;

import java.util.Scanner;


public class JA0831_11_Rename {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			System.out.println("점수를 입력하세요.");
			System.out.print("국어점수 : ");
	//		while(!scan.hasNextInt()){scan.nextLine();}
			kor = scan.nextInt();
			System.out.print("영어점수 : ");
	//		while(!scan.hasNextInt()){scan.nextLine();}
			eng = scan.nextInt();
			System.out.print("수학점수 : ");
	//		while(!scan.hasNextInt()){scan.nextLine();}
			math = scan.nextInt();
		}
			total = kor+eng+math;
			avg = total/3.0;
			
			System.out.printf("이름 : %s\n", name);
			System.out.println("국어점수 : " + kor + "\n영어점수 : " + eng + "\n수학점수 : " + math);
			System.out.printf("합계: %d\n", total);	
			System.out.printf("평균 : %.2f\n", avg);
	
		
	}

}
