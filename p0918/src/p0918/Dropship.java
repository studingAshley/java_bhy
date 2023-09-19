package p0918;

public class Dropship extends AirUnit implements Repairable {

	Dropship(int hp)
	{
		super(hp);
		hitPoint = MAX_HP;
		name = "Dropship";
	}
	public Dropship() {
		this(150);
		// TODO Auto-generated constructor stub
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%s.move\n[x:%d, y:%d]\n",name,x,y);
		
	}

}
