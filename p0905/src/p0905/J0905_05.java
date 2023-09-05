package p0905;

public class J0905_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j = 2 ; j <= 9 ; j++)
		{
			System.out.printf("[ "+j+"단 ]\t");
		}
		System.out.println();
		for(int k = 1 ; k <= 9 ; k++ )
		{
			
			for(int j = 2 ; j <= 9 ; j++)
			{
				System.out.printf("%d*%d=%d\t",j,k,(j*k));
			}
			System.out.println();
		}
		
//		for(int i = 2 ; i <=9 ; i ++)
//		{
//			System.out.println("[  "+i+"단  ]");
//			for(int j = 1 ; j <= 9 ; j++)
//			{
//				System.out.printf("%d * %d = %d\t", i, j, (i*j));
//			}
//			System.out.println("");
//		}
//
	}

}
