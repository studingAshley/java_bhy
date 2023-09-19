package p0918;

public abstract class GroundUnit extends Unit {

	GroundUnit()
	{
		this(150);
	}
	GroundUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub\
		name = "GroundUnit";
	}

	
	// Unit클래스의 추상메소드 move를 구현하지 않아 추상클래스로 선언  

}
