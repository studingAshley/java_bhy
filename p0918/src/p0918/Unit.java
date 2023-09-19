package p0918;

public abstract class Unit {
	int x, y;
	int hitPoint; // 체력
	String name;
	final int MAX_HP; //최대체력
	
	Unit(int hp)
	{
		MAX_HP = hp; //생성자에서 값 초기화 가능
	}
	
	abstract void move(int x, int y);
	
	void stop()
	{
		System.out.println("Unit.Stop");
	}

}
