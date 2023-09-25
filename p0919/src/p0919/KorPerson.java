package p0919;

public class KorPerson {
	
	KorPerson(){}
	KorPerson(String juminNo, String name)
	{
		this.juminNo = juminNo;
		this.name = name;
	}
	String juminNo;
	String name;

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) {
            return true;
        }
		return (((KorPerson)obj).juminNo.equals(this.juminNo) && ((KorPerson)obj).name.equals(this.name));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s,%s]", juminNo,name);
	}
}
