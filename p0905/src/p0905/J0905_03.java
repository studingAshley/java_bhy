package p0905;

public class J0905_03 {

	public static void main(String[] args) {
//		int i = 0; int sum= 0;
//		for( i = 0; i <= 10 ; i++)
//		{
//			sum += i;
//			//break;//sksms qmfpdlzmrk tlfgek . . . . 
//		}
//
//		System.out.println("i : "+ (i-1));
//		System.out.println("sum : "+ sum);
	
		int sum = 0;
		int j = 0;
		for(int i = 1 ; i <= 100 ; i+=2)
		{
			j++;
			sum = sum + i;
			System.out.printf("%d. %d\n",j,sum);
		}
	
	}

		
}
