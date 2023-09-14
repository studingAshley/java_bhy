package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class J0914_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		list.add(new Member("aaa","1111","Hong","Seoul","010-1111-1111"));
		list.add( new Member("bbb","2222","Yu","Busan","010-2222-2222"));
		list.add(new Member("ccc","3333","Lee","Daegu","010-3333-3333"));
		list.add( new Member("ddd","4444","Kang","Inchon","010-4444-4444"));
		list.add(new Member("eee","5555","Kim","Gwangju","010-5555-5555"));
		

		String id = "";
		String pw = "";
		String name = "";
		boolean isloop = true;
		boolean isloop2 = true;
		
		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		
		while(isloop)
		{
			System.out.println("아이디를 입력하세요.");
			id = scan.next();
			System.out.println("패스워드를 입력하세요.");
			pw = scan.next();
			
			boolean isfind = false;
			for(int i = 0 ; i < list.size() ; i++)
			{
				Member m = (Member)list.get(i);
				if(id.equals(m.getId()) && pw.equals(m.getPw()))
				{
					isfind = true;
					isloop = false;
					name = m.getName();
				}
			}
			
			if(isfind)
			{
				System.out.println("로그인 되었습니다. ");
			}
			else
			{
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			}
		}
		
		System.out.println("프로그램 시작");
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
			
		while(isloop2)
		{
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. Tv");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("6. 프로그램종료");
			System.out.println("9. 전체구매목록");
			System.out.println("-----------------");
			System.out.println("구매를 원하는 번호를 입력하세요");

			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1 :
				System.out.println("[ TV 구매 ]");
				System.out.println("결제를 진행할까요?(1.예 2.아니오)");
				choice = scan.nextInt();
				if(choice ==1)
				{
					System.out.println("TV를 구매하셨습니다.");
					b1.buy(new Tv());
					System.out.printf("구매 후 잔액 : %,d원\n",b1.money);
				}
				else
				{
					System.out.println("TV구매를 취소하셨습니다.");
					System.out.println();
					break;
				}
				break;
			case 5 :
				System.out.println("[ 잔액 조회 ]");
				System.out.println("--------------");
				System.out.printf("%s님의 현재잔액 : %,d원\n",b1.name,  b1.money);
				break;
			case 6 :
				break;
			}
		}

	}

}
