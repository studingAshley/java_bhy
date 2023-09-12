package p0912;

public class StuScore2 {
	int StdNo;
	String name;
	int kor,eng,math;
	int total;
	double avg;
	
	StuScore2(){}
	StuScore2(int StdNo, String name, int kor, int eng,int math)
	{
		this.StdNo = StdNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
	}

	void printData()
	{
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",StdNo,name,kor,eng,math,total,avg);
	}
}
