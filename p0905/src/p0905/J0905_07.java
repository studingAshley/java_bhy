package p0905;

public class J0905_07 {

	public static void main(String[] args) {

		int sum = 0 ;
		int i = 0;
		
		for(i = 1; i <=100 ; i++)
		{
			sum = sum + i;
			System.out.printf("%d. %d\n",i,sum);
		}
		
		i = 1;
		sum = 0;
		while(i<=100)
		{
			sum = sum + i;
			System.out.printf("%d. %d\n",i,sum);
			i++;
		}

	}

}
