package p0914;

public class J0914_01 {

	public static void main(String[] args) {
		StuScore s1 = new StuScore();
		s1.setStuNo(1);
		System.out.println("학번 : " + s1.getStuNo());
//
//		s1.setStuNo(1);
//		s1.setName("Hong");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMath(100);
//		s1.setTotal(s1.getKor()+s1.getEng()+s1.getMath());
//		s1.setAvg(s1.getTotal()/3.0);
		
//		StuScore s1 = new StuScore(1, "Hong");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMath(100);

		StuScore s2 = new StuScore(1,"Hong",100,100,100);
		System.out.println("학번 : "+ s2.getStuNo());
	}
}
