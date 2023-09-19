package p0915_학생성적;

public class StuScore {

	static int NumCounter = 1 ;
	
	{
		stuNo = NumCounter++;
	}
	
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	private final double NumSub = 3.0;
	
	public StuScore()
	{
		
	}
	
	

	public StuScore(String name, int kor, int eng, int math) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/NumSub;
	}



	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
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
		setTotal();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setTotal();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setTotal();
	}

	public int getTotal() {
		return total;
	}
	
	public void setTotal()
	{
		this.total = kor+eng+math;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}

	void setAvg()
	{
		this.avg = total/NumSub;
	}
	
	void setRank(int rank)
	{
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}

	
	
}


