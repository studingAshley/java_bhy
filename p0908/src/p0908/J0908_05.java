package p0908;

public class J0908_05 {

	public static void main(String[] args) {
		
		StuScore s1 = new StuScore(1,"hong",100,100,100);
		StuScore s2 = new StuScore(2,"Yu",90,90,90);
		s1.avg();
		s2.avg();
		
		
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s1.stuNo, s1.name, s1.kor, s1.eng, s1.math, s1.total,s1.avg);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s2.stuNo, s2.name, s2.kor, s2.eng, s2.math, s2.total,s2.avg);
		
	}

}
