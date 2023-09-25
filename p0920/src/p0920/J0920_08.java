package p0920;

public class J0920_08 {

	public static void main(String[] args) {
		String str = "아이폰15는 최신폰입니다. 아이폰15는 애플에서 만들었어요. 아이폰15의 가격은 200만원입니다.";
		int result = 0;
		int count = 0 ;
		System.out.println(result);
		
		while(-1<result)
		{
			
			result = str.indexOf("아이폰15",result);
			if(-1<result)
			{
				count++;
				result++;
			}
		}
		
		System.out.println("개수 : "+count);
	}

}
