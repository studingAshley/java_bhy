package p0920;

public class J0920_14 {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("제대로 출력 : " + str);
		
		
		System.out.print("반대로 출력 : ");
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();

		//StringBuffer reverse
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
	}

}
