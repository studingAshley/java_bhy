package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class J0914_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isloop2 = true;
		String id = "";
		String pw = "";
		
		AllMember m = new AllMember();
	//	ArrayList list = m.readMember();
		
		while(isloop2)
		{
			System.out.println("아이디를 입력하세요");
			id = scan.next();
			System.out.println("패스워드를 입력하세요");
			pw = scan.next();
			
			for(int i = 0 ; i < m.list.size() ; i++)
			{
		
			}
			
		}
		
		
		
		
		
		
		
		Buyer b1 = new Buyer();
		
		boolean isloop = true;
		int choice = 0;
			
		while(isloop)
		{
			System.out.println("[ 가전제품 쇼핑몰 ]");
			System.out.println("1. Tv");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("-----------------");
			System.out.println("구매를 원하는 번호를 입력하세요");
			System.out.println();
			System.out.println();
			choice = scan.nextInt();
		}
	}

}
