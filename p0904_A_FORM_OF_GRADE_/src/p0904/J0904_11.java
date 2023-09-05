package p0904;

public class J0904_11 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		boolean under = true;
		
		for (i = 1 ; (i <=100) ; i++)
		{
			sum = sum + i;
			if((sum >=  200) && under)
			{
				System.out.printf("i : %d, sum : %d\n",i,sum);
				under = false;
			}
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		
//		int sum=0;
//		int i = 0;
//		
//		for(i = 1 ; i <=100 ; i++)
//		{
//			sum = sum + i ;
//		}
//		
//		System.out.printf("1부터 %d까지 합계 : sum\n : ", (i-1), sum);
//		
		
//		long sum=0;
//
//		for(int i = 1 ; i <= 1000 ; i++)
//		{
//			System.out.printf("%d, ",i);
//			sum = sum + i;
//		}
//		System.out.println("");
//		System.out.println("SUM : "+sum);
	}

}
