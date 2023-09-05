package p0831;

public class JA0831_01 {

	public static void main(String[] args) {

		int total = 0 ;
		int kor = 0 ;
		int eng = 0 ;
		double  avg = 0 ;
		
		kor = 98;
		eng = 91;
		
		total = kor + eng ; 
		avg = (double)total/2;
		
		System.out.print("합계 : ");
		System.out.println(total);
		System.out.print("평균 : ");
		System.out.println(avg);

	}

}
