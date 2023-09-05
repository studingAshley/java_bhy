package p0904;

import java.util.Scanner;

public class J0904_04 {

	public static void main(String[] args) {
		//아까 했잖아여 ~?
		
		Scanner scan = new Scanner(System.in);
		int sc = 0 ;
		String grade ="";
		
		System.out.println("점수를 입력하세요.");
		sc = scan.nextInt();
		
		if(sc >= 90)
		{
			//System.out.printf("학점 : A");
			grade = "A";
			if(sc>=98)
			{
				//System.out.println("+");
				grade = grade + "+";
			}
			else if (sc <= 93)
			{
				//System.out.println("-");
				grade = grade + "-";
			}
//			else
//			{
//				System.out.println("");
//			}
			
		}
		else if (sc >= 80)
		{
			//System.out.printf("학점 : B");
			grade = "B";
			if(sc>=88)
			{
				//System.out.println("+");
				grade = grade + "+";
			}
			else if (sc <= 83)
			{
				//System.out.println("-");
				grade = grade + "-";
			}
//			else
//			{
//				System.out.println("");
//			}
		}
		else if (sc >= 70)
		{
			//System.out.printf("학점 : C");
			grade = "C";
			if(sc>=78)
			{
				//System.out.println("+");
				grade = grade + "+";
			}
			else if (sc <= 73)
			{
				//System.out.println("-");
				grade = grade + "-";
			}
//			else
//			{
//				System.out.println("");
//			}
		}
		else if (sc >= 60)
		{
			//System.out.printf("학점 : D");
			grade = "D";
			if(sc>=68)
			{
				//System.out.println("+");
				grade = grade + "+";
			}
			else if (sc <= 63)
			{
				//System.out.println("-");
				grade = grade + "-";
			}
			else
			{
				//System.out.println("");
			}
		}
		else 
		{
			grade = "F";
		}
		
		System.out.println("학점 : " + grade);
		System.out.println("점수 : "+ sc);
		
		A a1 = new A("hello");
		A a2 = new A("hello");
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.name.equals(a2.name));
		B b1 = new B("hello");
		B b2 = new B("hello");
		
		System.out.println(b1.equals(b2));
		
		Object testObj = new String("TestObj");

	}

}


class A {
	String name;
	A(String name)
	{
		this.name = name;
	}
	
}

class B{
	String name;
	
	B(String name)
	{
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this.name.equals(((B)obj).name ))// == ((B) obj).name)
		{
			return true;
		}
		else 
		{
			return false;	
		}
				
	}
}