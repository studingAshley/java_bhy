package p0911;

public class J0911_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		
		Test test = new Test();
		d.x = 10;
		
		System.out.println("d.x : " + d.x);
		
		System.out.println(d);
		test.change(d);
		System.out.println("2번째 d.x : "+d.x);
		

	}

}

class Test
{
	void change(Data d)
	{
		d.x = 1000;
		System.out.println("change x : " +d.x);
	}
}