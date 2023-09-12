package p0908;

public class StuScore {
	int stuNo;
	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	StuScore()
	{
	
	}
	
	StuScore(int stuNo, String name, int kor, int eng, int math)
	{
		this();
		
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void total()
	{
		total = kor+eng+math;
	}
	
	void avg()
	{
		total();
		avg = total/3.0;
	}

}

