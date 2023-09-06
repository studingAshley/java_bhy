package p0906;

public class J0906_01 {

	public static void main(String[] args) {
		int[] num = new int[50];
		int[] random = new int[6];
		
		for(int i = 0 ; i<num.length ; i++)
		{
			num[i] = i+1;
			System.out.println("i : "+num[i]);
		}
		
		for(int i = 0 ; i < random.length; i++)
		{
			random[i] = (int)(Math.random()*45);
			System.out.println("랜덤 뽑기 : "+num[random[i]]);
		}
		
		
	}

}
