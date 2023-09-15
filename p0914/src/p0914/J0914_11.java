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
			System.out.println();
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. Tv");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("8. 전체구매목록");
			System.out.println("9. 금액충전");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------");
			System.out.println("구매를 원하는 번호를 입력하세요");

			choice = scan.nextInt();
			boolean check = false;
			

			switch(choice)
			{
			case 0 : 
				isloop2 = false;
				break;
			case 1 :
				buyProduct("TV",b1);
				break;
			case 2 :
				buyProduct("컴퓨터",b1);
				break;
			case 3 :
				buyProduct("오디오",b1);
				break;
			case 4 :
				buyProduct("세탁기",b1);
				break;
			
			case 5 :
				System.out.println("[ 잔액 조회 ]");
				System.out.println("--------------");
				System.out.printf("%s님의 현재잔액 : %,d원\n",b1.name,  b1.getmoney());
				break;
			case 8 :
				System.out.println("[ 상품구매목록 ]");
				System.out.println("--------------");
				b1.printlist();
				break;
			case 9 : 
				System.out.println("[ 금액 충전 ]");
				System.out.println("--------------");
				System.out.println("충전하려는 금액을 입력하세요");
				int coin = scan.nextInt();
				//카드사 연결 URL을 넣음 
				b1.addmoney(coin);
				System.out.println("--------------");
				System.out.printf("충전 금액 : %,d원\n", coin);
				System.out.printf("충전 후 잔액 : %,d원\n", b1.getmoney());
				break;
			}//switch
		}//while

	}//main
	
	static void buyProduct(String pName, Buyer b)
	{
		Scanner scan = new Scanner(System.in);
		boolean check = false;
		
		System.out.printf("[ %s 구매 ]\n",pName);
		System.out.println("결제를 진행할까요?(1.예 2.아니오)");
		int choice = scan.nextInt();
		if(choice ==1)
		{
		
			if(pName.equals("TV"))
			{
				check = b.buy(new Tv());
			}
			else if (pName.equals("컴퓨터"))
			{
				check = b.buy(new Computer());
			}
			else if(pName.equals("오디오"))
			{
				check = b.buy(new Audio());
			}
			else if(pName.equals("세탁기"))
			{
				check = b.buy(new Washing());
			}
			if(check)
			{
				System.out.printf("%s를 구매하셨습니다.\n",pName);
				System.out.printf("구매 후 잔액 : %,d원\n",b.getmoney());
			}
		}
		else
		{
			System.out.printf("%s 구매를 취소하셨습니다.\n",pName);
			System.out.println();
			return;
		}
	}// buyProduct

}//class
