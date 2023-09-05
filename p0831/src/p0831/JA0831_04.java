package p0831;

public class JA0831_04 {

	public static void main(String[] args) {

		String name = new String("배향연");
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = 0;
		
		char grade ='A';
		char grade2 = ' ';
		
		String str = new String();
	
		kor = 99;
		eng = 98;
		math = 100;
		
		total = kor + math + eng ;
		
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(kor);
		System.out.print("영어 : ");
		System.out.println(eng);
		System.out.print("수학 : ");
		System.out.println(math);
		System.out.print("합계 : ");
		System.out.println(total);

	}

}
