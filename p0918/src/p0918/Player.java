package p0918;

abstract public class Player {
	int currentPos; 
	
	Player()
	{
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play()
	{
		play(currentPos); // 추상 메서드 호출
	}
	
}
