package p0905;

public class J0905_06 {

	public static void main(String[] args) {
		
		int i = 2, j = 1;
		
		while(i<=9)
		{
			while(j<=9)
			{
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
				j++;
			}
			i++;
			j = 1;
		}
		
//		for(int i = 2 ; i <=9 ; i++)
//		{
//			for(int j = 1 ; j <=9 ; j++)
//			{
//				System.out.printf("%d * %d = %d\n", i, j, (i*j));
//			}
//		}
//		int i = 10;
//		while(i<10)
//		{
//			
//		}
//		
//		int i = 10;
//		while(i>=0)
//		{
//			System.out.println(i);
//			i = i - 1;
//		}

	}

}
