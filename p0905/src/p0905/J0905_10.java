package p0905;

public class J0905_10 {

	public static void main(String[] args) {
		
		int i , j;
		
		for(i = 2 ; i<=9 ; i++ )
		{
			if(i%2==1)
			{
				continue;
			}
			System.out.printf("%d단\t",i);
			for(j = 1 ; j <=9;j++)
			{
				if(j%2 ==0)
				{
					continue;
				}
				System.out.printf("%d * %d = %d\t",i,j,(i*j));
			}
			System.out.println();
		}

//		for(int i=1; i<=10 ; i++)
//		{
//			if((i%3)==0)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}

	}

}
