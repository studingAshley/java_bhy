package p0908;

import java.util.Scanner;

public class J0808_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StuScore[] s = new StuScore[2];

		for(int i= 0; i<2 ; i++)
		{
			s[i] = new StuScore();
			System.out.println("학번을 입력하세요");
			s[i].stuNo = i + 1;
			System.out.println("이름을 입력하세요");
			s[i].name = scan.next();
			System.out.println("국어 점수를 입력하세요");
			s[i].kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			s[i].math = scan.nextInt();
			s[i].avg();
		}
		
		
	}

}
