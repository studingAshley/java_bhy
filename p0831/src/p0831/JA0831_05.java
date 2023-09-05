package p0831;

public class JA0831_05 {
	
	public static void main(String[] args)
	{
		char ch = ' ';
		int num = 7;
		int num2 = 8;
		
		int kor = 98;
		int eng = 99;
		int math = 100;
		
		String str = "";
		String name = "홍길동";
		
		System.out.println(7+7);
		System.out.println(7+"");
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		System.out.println("----------");
		
		System.out.println(num+num2);
		System.out.println(str+num+num2);
		System.out.println(num+num2+str);
		System.out.println("합계 : " + (num+num2));

		//System.out.println("\n이름 : " + name + "\n국어점수 : " + kor + "\n영어점수 : " + eng + "\n수학점수 : " + math);
		System.out.println("\n이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("합계 : " + (kor+eng+math));
		
		
	}

}
