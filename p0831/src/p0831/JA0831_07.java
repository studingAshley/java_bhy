package p0831;

public class JA0831_07 {

	public static void main(String[] args) {

		double d = 1.6;
		double d2 = 0 ;
		
		int i = (int)d;
		int x = 0x80000000;
		d2 = (long)x - 1;
		
		System.out.println(i);
		System.out.println(x);
		System.out.println(d2);
		
		System.out.println(10/3.0);
		System.out.printf("%.2f\n", 10/3.0);
		System.out.println("안녕");
		System.out.printf("%s \n", "문자열");
		System.out.printf("%,012d\n",1000000); // 천단위 콤마표시. 콤마포함 남는자리에 0을 채움, 12개 자리까지 출력. 
		System.out.printf("국어 : %d\n영어 : %d\n", 100, 99);
		
		
	}

}
