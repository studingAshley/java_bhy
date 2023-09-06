package p0906;

public class J0906_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[100];
		
		for(int i = 0 ; i < num.length ; i++)
		{
			num[i] = i + 1;
		}
		
		for(int i = 0 ; i < num.length ; i++)
		{
			System.out.print(num[i]);
			if(i<(num.length-1))
			{
				System.out.print(", ");
			}
		}//for
		System.out.println();
	}

}
