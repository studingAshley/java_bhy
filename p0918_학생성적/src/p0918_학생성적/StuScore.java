package p0918_학생성적;

public class StuScore {
	
	private final double numOfSub = 3.0;
	
	private int stuNum;
	private String name;
	private int kor, eng, math;
	private int total, rank;

	private double avg;
	
	static int stuCounter;
	{
		stuCounter++;
	}
	
	
	
	StuScore()
	{
		
	}
	
	StuScore(String name, int kor, int eng, int math)
	{
		this.stuNum = stuCounter;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/numOfSub;
		
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = this.total/numOfSub;
	}


	
	
	

}
