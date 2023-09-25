package p0925;

public class StuScore {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	[ 인스턴스 변수 ]
	private int stuNum;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	private int rank;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	// [ 클래스 변수 ]//
	private static int count = 1;
	{
		stuNum = count++;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 	 	[ 생성자 ]
	public StuScore() {
		
	}


	public StuScore(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total/3.0;
		this.rank = 1;
	}


	public StuScore(int stuNum, String name, int kor, int eng, int math, int total, double avg, int rank) {
		super();
		this.stuNum = stuNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


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
		this.total = this.kor + this.eng + this.math;
		this.avg = total/3.0;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
		this.total = this.kor + this.eng + this.math;
		this.avg = total/3.0;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
		this.total = this.kor + this.eng + this.math;
		this.avg = total/3.0;
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


