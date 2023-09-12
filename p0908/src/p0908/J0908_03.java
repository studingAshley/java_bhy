package p0908;

public class J0908_03 {

	public static void main(String[] args) {

		Tv t = new Tv();
		
		t.channel = 7 ;
		t.channel = 9 ;
		t.channelUp();
		t.channelUp();
		
		System.out.println(t.channel);
		
		
		
	}

}
