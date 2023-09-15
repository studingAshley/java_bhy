package p0915_학생성적;

import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isloop=true;
		
		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		String id = "aaa";
		String pw = "1111";
		String name = "홍길동";
		
		Buyer b = new Buyer(id,name);
		
		while(isloop)
		{
			int choice = 0 ;
			
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1.TV 구매");
			System.out.println("2.컴퓨터 구매");
			System.out.println("3.오디오 구매");
			System.out.println("4.세탁기 구매");
			System.out.println("5.현재잔액조회");
			System.out.println("6.구매목록");
			System.out.println("7.금액충전");
			System.out.println("0.프로그램 종료");
			System.out.println("----------------");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
				case 0 :
					isloop = false;
					System.out.println("프로그램을 종료합니다.");
				break;
				
				case 1 :
					buyProduct("TV",b);
				break;
				
				case 2 : 
					buyProduct("컴퓨터",b);
				break;
				
				case 3 : 
					buyProduct("오디오",b);
				break;
				
				case 4 :
					buyProduct("세탁기",b);
				break;
				case 5 :
					b.balance();
				break;
				case 6 : //구매목록
					b.printList();
				break;
				
				case 7 : //금액충전
					int m;
					System.out.println("충전할 금액을 입력하세요");
					System.out.printf("금액 : ");
					m = scan.nextInt();
					b.addMoney(m);
				break;
				
			
			} //switch
			System.out.println();
		}
	}
	
	static void buyProduct(String p, Buyer b)
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0 ;
		boolean check = false;
		
		System.out.println(p+"를 구매하시겠습니까? (1. 예, 2. 아니오)");
		choice = scan.nextInt();
		
		if(choice == 1)
		{
			if(p.equals("TV"))
			{
				check = b.addCart(new Tv());
				
			}
			else if(p.equals("컴퓨터"))
			{
				check = b.addCart(new Computer());
			}
			else if(p.equals("오디오"))
			{
				check = b.addCart(new Audio());
				
			}
			else if(p.equals("세탁기"))
			{
				check = b.addCart(new Washing());
			}
			if(check)
			{
				System.out.println(p+"를 구매하였습니다.");
			}
			System.out.printf("남은 잔액 : %,d원 \n",b.getMoney());
		}
		else
		{
			System.out.println("구매가 취소되었습니다.");
		}
		
	}

}
