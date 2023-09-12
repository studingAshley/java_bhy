package p0908;

import java.util.Scanner;

public class J0908_07 {

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		Time[] t= new Time[3];
		
		
		for(int i = 0 ; i < 3 ; i++)
		{
			t[i] = new Time(); //1개의 시간 저장 변수 생성
			System.out.println("시 입력 : ");
			t[i].hour = scan.nextInt();
			System.out.println("분 입력 : ");
			t[i].minute = scan.nextInt();
			System.out.println("초 입력 : ");
			t[i].second = scan.nextDouble();
		}
		
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println(t[i].hour+"시 "+t[i].minute+"분 "+t[i].second+"초");
		}

	}

}
