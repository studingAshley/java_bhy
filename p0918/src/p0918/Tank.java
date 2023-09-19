package p0918;

public class Tank extends GroundUnit implements Repairable{

	Tank()
	{
		this(150);
	//	name = "Tank";
	}
	
	Tank(int hp)
	{
		super(hp);
		name = "Tank";
		hitPoint = MAX_HP;
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%s.move\n[x:%d, y:%d]\n",name,x,y);
		
	}


}
