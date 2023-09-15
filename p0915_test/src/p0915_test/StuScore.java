package p0915_test;

public class StuScore {
	
	final double numOfSub = 3.0;
	
	private int stuNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	static int count = 1;
	{
		stuNum = count++; //초기화블럭 - DB에서 번호를 부여하는 부분(추후구현)		
	}
	
	StuScore()
	{
		//
	}
	
	StuScore(String name, int kor, int eng, int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total/numOfSub;
	}


	
	public int getStuNum() {
		return stuNum;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public int getRank() {
		return rank;
	}

	
	
	
}
