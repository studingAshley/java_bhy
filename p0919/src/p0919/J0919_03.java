package p0919;

import java.util.Scanner;

public class J0919_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try
		{
			System.out.println(1);
			System.out.println(2);
		//	System.out.println(3/0);
			System.out.println("for문을 실행할까요? <1.예 2.아니오>");
			int choice = scan.nextInt();
			if(choice == 1 )
			{
				for(int i = 0 ; i < 10 ; i++)
				{
					System.out.println(i+10);
					try {
						System.out.println(10/0);//Arithmatic Exception
					} catch (Exception e) {
						System.out.println(e.toString());
					}
					
				}
				
			}
			
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
			
		}catch(Exception e)
		{
			System.out.println(8);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(9);

	}
}
