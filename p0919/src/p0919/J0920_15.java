package p0919;

public class J0920_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b = 12.912;
//		System.out.println(Math.round(b));
		
		int no1 = 5;
		int no2 = 15;
		int no3 = 2;
		
//		System.out.println(Math.max(no1, no2));
		
		System.out.println("최대값 : " + Math.max(no3, Math.max(no1, no2)));
		System.out.println("최소값 : " + Math.min(no3, Math.min(no1, no2)));
		
		String str = "";
		

		if(no1 < no2 || no1 < no3)
		{
				str += no1;
				if(no2 < no3)
				{
					str += ", "+no2 +", "+ no3;
				}
				else 
				{
					str += ", "+no3 +", "+ no2;
				}

		}
		else if(no1 > no3 || no1 > no3)
		{
			str += no3;
			if(no1 > no2)
			{
				str+= ", "+no2+", "+no1;
			}
			else 
			{
				str+= ", "+no1 + ", "+no2;
			}
		}
		
		System.out.println(str);

	}

}
