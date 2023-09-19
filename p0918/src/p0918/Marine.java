package p0918;

public class Marine extends GroundUnit {

	Marine(int hp)
	{
		super(hp);
		hitPoint = MAX_HP;
		name="Marine";
	}
	public Marine() {
		this(60);
		// TODO Auto-generated constructor stub
	}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("%s.move\n[x:%d, y:%d]\n",name,x,y);
		
	}

}
