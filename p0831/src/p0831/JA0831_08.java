package p0831;

public class JA0831_08 {
	
	public static void main(String[] args)
	{
		
		int age = 20;
		int kor = 100;
		int eng = 100;
		int math = 99;
		int total = 0;
		double avg = 0;
		
		int vinput = 0 ;
		String address = "서울특별시 구로구 구로동";
		
		System.out.println("당신의 나이는 "+age+"세, 사는 곳은 "+address+"입니다.");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s입니다.\n", age, address);
		
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.printf("평균 : %.2f\n", avg);
		
		System.out.printf("%05.2f", 5.8);
		
		

		
	}

}
