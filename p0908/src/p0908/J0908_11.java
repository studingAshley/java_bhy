package p0908;


public class J0908_11 {

	public static void main(String[] args) {

		int kor = 100;
		int eng = 99;
		int math = 98;
		String teststr1 = "A";
		String teststr2 = "C";

		System.out.println("합계 : " + total(kor,eng,math));
		System.out.println("평균 : " + avg(kor,eng,math));
		
		System.out.println(teststr1.hashCode());
		System.out.println(teststr2.hashCode());
		teststr2 = test(teststr1);
		System.out.println(teststr1.hashCode());
		System.out.println(teststr2.hashCode());
		
	}

	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	static double avg(int kor, int eng, int math)
	{
		return (kor+eng+math)/3.0;
	}
	
	static String test(String str)
	{
		str = "B";
		return str;
	}
}
