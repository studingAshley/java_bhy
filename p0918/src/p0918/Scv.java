package p0918;

public class Scv extends GroundUnit implements Repairable {

	Scv()
	{
		this(60);
	}
	Scv(int hp)
	{
		super(hp);
		hitPoint = MAX_HP;
		name = "SCV";
	}
	
	@Override
	void move(int x, int y) {
		System.out.printf("%s.move\n[x:%d, y:%d]\n",name,x,y);
		
	}
	
	void repair(Repairable g)
	{
		if(g instanceof Unit)
		{
			Unit u = (Unit)g;
			while(u.hitPoint!= u.MAX_HP)
			{
				u.hitPoint++;
			}
		}
	}

}
