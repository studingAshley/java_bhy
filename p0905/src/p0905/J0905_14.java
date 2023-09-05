package p0905;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=0;
		int i = 0;
		int[] num = new int[10];
		int random = (int)(Math.random()*100)+1;
		boolean w = true;
		
		for(i = 0; (i < 10) && w ; i++)
		{
			System.out.println("1-100숫자를 입력하세요 ");
			input = scan.nextInt();
			num[i]= input;
			
			if(input > random)
			{
				System.out.println(input+"보다 작은 수입니다 \n");
			}
			else if(input < random)
			{
				System.out.println(input+"보다 큰 수입니다 \n");
			}
			else 
			{
				System.out.println("정답입니다. \n");
				w = false;
			}
			
		}
		
		if(w)
		{
			System.out.println("다 틀렸습니다. 정답은 "+random+"입니다.\n");
		}
		
		System.out.println("입력한 숫자들");
		for(int j = 0 ; j < i ; j ++ )
		{
			System.out.printf("%d",num[j]);
			if(j < i -1) 
			{
				System.out.printf(", ");
			}
		}
		
		

//		System.out.println(Arrays.toString(num));
//		
//		for(int i = 0 ; i < num.length ; i++)
//		{
//		}

	}

}
