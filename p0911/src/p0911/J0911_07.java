package p0911;

import java.util.Scanner;

public class J0911_07 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		int kor = 0 ;
		
		
		System.out.println("학번 입력 ");
		int stdNum = scan.nextInt();
		
		name = nameInput();
		kor = korInput();
		

		System.out.println("학번 : "+stdNum);
		System.out.println("이름 : "+name);
		System.out.println("국어점수 : "+kor);
		
	}
	
	static String nameInput()
	{
		String name = "";
		System.out.println("이름을 입력");
		name = scan.next();
		
		return name;
	}
	
	static int korInput()
	{
		int kor = 0;
		System.out.println("국어 점수 입력 ");
		kor = scan.nextInt();
		
		return kor;
	}

}
