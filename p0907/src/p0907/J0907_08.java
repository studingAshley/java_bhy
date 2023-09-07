package p0907;

public class J0907_08 {

	public static void main(String[] args) {
		
		StringBuffer strbuffer = new StringBuffer();

		int[] num = {1,2,3,4,6};
		
		for(int i = 0 ; i < num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		for(int i : num)
		{
			System.out.println(i);
		}

	}

}
