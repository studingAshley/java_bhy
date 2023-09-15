package p0915_test;

public class JMethod {
	
	JMethod()
	{
		//
	}
	
	int cal(int a, int b)
	{
		return (a+b)+(a-b)+(a*b)+(a/b);
	}
	
	int cal(int a, int b, int c, int d)
	{
		return (a+b+c+d)+(a*b*c*d);
	}
	
	int cal(int[] n)
	{
		return (n[0]+n[1]+n[2]+n[3])+(n[0]*n[1]*n[2]*n[3]);
	}

}
