package p0912;

public class Child extends Parent{
	//int x = 20;
	
	Child()
	{
		//super(100) ;
		System.out.println("Child");
	}
	void method()
	{
		int x = 100;
		System.out.println("x : "+x);
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+ super.x);
	}

}
