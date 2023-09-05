package p0905;

public class J0905_09 {

	public static void main(String[] args) {

		int i = 0 ;
		int sum = 0;
		
		while(true)
		{
			System.out.println("i : "+i);
			System.out.println("sum : "+sum);
			if(sum > 200)
			{
				break;
			}
			i++;
			sum = sum + i;
		}
		int j = 0;
		sum = 0;
		for(j = 1 ; j <= 100 ; j++)
		{
			sum = sum + j;
			if(sum>100)
			{
				break;
			}
		}
		System.out.println("j : "+j);
		System.out.println("sum : "+sum);

	}

}
