package p0908;

import java.util.Scanner;

public class J0908_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hour = new int[3];
		int[]minute = new int[3];
		double[] second = new double[3];
		
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println("시를 입력하세요");
			hour[i] = scan.nextInt();
			System.out.println("분을 입력하세요");
			minute[i] = scan.nextInt();
			System.out.println("초를 입력하세요(예:45.02");
			second[i] = scan.nextDouble();
		}
		
		System.out.print(hour[1]+":"+minute[1]+":"+second[1]);
		System.out.println();
		System.out.print(hour[1]+"시"+minute[1]+"분"+second[1]+"초");
		
		second[2] = 59.12;
	}

}
