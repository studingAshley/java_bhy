package p0922;

public class StuScore {
	
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
		this.stuNum = count++;
	}
	
	StuScore(){}
	StuScore(StuScore s ){
		this.stuNum = s.stuNum;
		this.name = s.name;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.total = s.total;
		this.avg = s.avg;
		this.rank = s.rank;
	
	}
	
	public StuScore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total/3.0;
	}

	public StuScore(int stuNum, String name, int kor, int eng, int math, int total, double avg, int rank) {
		this.stuNum = stuNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
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
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

}
