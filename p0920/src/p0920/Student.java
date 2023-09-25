package p0920;

public class Student {

	private int stuNum;
		
	Student(){}
	Student(int stuNum)
	{
		this.stuNum = stuNum;
	}
	
	//새로운 객체를 복사 
	Student(Student s )
	{
		this.stuNum = s.getStuNum();
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	@Override
	public boolean equals(Object obj) {
	
		return (this.stuNum ==((Student)obj).getStuNum());
	}
}
