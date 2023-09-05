package p0831;

public class JA0831_13 {

	public static void main(String[] args) {

		int a = 1;
		boolean power = true;
		char ch = 'A';
		char ch2 = 'a';
		
		while(a < 10)
		{
			a++;
		}
		
		//System.out.println(a);
		
		System.out.println(power);
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		
		System.out.println(""+ch+ch2);
	}

}
