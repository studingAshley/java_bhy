package p0905;

public class J0905_02 {

	public static void main(String[] args) {

		int sum=0;
		for(int i = 1 ; i <= 100 ; i++)
		{
			sum += i;

			
			if(sum >= 300)
			{
				System.out.printf("i : %d,\t sum : %d\n",i,sum);
				System.out.printf("i : %d,\t sum : %d\n",i-1,sum-i);
				break;
			}
		}
		
	}

}
