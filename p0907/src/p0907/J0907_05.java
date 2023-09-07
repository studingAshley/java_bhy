package p0907;

import java.util.Scanner;

public class J0907_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		 int fNo= (int)(Math.random()*9)+1;
//		 int firstNo2 = (int)(Math.random()*9)+1;
		 int sNo = (int)(Math.random()*100000);
		
		 String strNo = String.format("%05d", sNo);
		 String winNo = fNo +"조"+strNo;
		// System.out.printf("당첨번호 : %d조%s\n", fNo, strNo);
	//	 System.out.println("당첨번호 : "+winNo);
// 졸려뒤질꺼같네 진짜 하 지ㅏㅂ에가고싶ㄷ3ㅏ ㅎ ㅏ'
		 
		 
		 System.out.printf("당첨번호 : %s\n ",winNo);	 	 
		 System.out.println("조 단위를 입력하세요. (1_-9 까지 )");
		 int input1 = scan.nextInt();
		 
		 System.out.println(input1 + "조 뒤 5자리를 입력하세요");
		 
		 String input2 = scan.next();
		 
		 String inputNo =  input1+"조"+input2;

		 System.out.println("입력번호 : "+inputNo);

		 
		 int count = 0 ;
		 if(inputNo.charAt(6) == winNo.charAt(6))
		 {
		//	 System.out.println("일치합니다");
			 count++;
			 
			 if(inputNo.charAt(5) == winNo.charAt(5))
			 {
				 count++;
				 if(inputNo.charAt(4) == winNo.charAt(4)) 
				 { count++;
					 if(inputNo.charAt(3) == winNo.charAt(3)) 
					 { count++;
						 if(inputNo.charAt(2) == winNo.charAt(2)) 
						 { count++;
							 if(inputNo.charAt(0) == winNo.charAt(0)) {count++;}
						 }
					 }
				 }
			 }
		 }
		 else 
		 {
	//		 System.out.println("불일치합니다");
		 }
		 
		 if(count == 0 )
		 {
			 System.out.println("꽝입니다.");
		 }
		 else if(count ==1)
			 
		 {
			 System.out.println("1개 맞췄습니다 당첨 1000원 !");
		 }
		 else if(count ==2)
		 {
			 System.out.println("2개 맞췄습니다 당첨 1000원 !");
		 }
		 else if(count ==3)
		 {
			 System.out.println("3개 맞췄습니다 당첨 1000원 !");
		 }
		 else if(count ==4)
		 {
			 System.out.println("4개 맞췄습니다 당첨 1000원 !");
		 }
		 else if(count ==5)
		 {
			 System.out.println("5개 맞췄습니다 당첨 1000원 !");
		 }
		 else if(count ==6)
		 {
			 System.out.println("6개 맞췄습니다 당첨 1000원 !");
		 }
	}

}
