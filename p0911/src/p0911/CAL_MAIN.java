package p0911;

public class CAL_MAIN {

//	CAL_MAIN(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub000
		
		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);

		Cal2 c2 = new Cal2(10);
		System.out.println(c2.value);
	}

}


class Cal1
{
	int value;
//	Cal1(){}
}

class Cal2
{
	int value;
	Cal2(){}
	Cal2(int x)
	{
		value = x;
	}
}