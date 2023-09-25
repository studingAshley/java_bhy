package p0920;

public class J0920_10 {

	public static void main(String[] args) {
		String str ="swim,golf,book,run,game";
		String[] hobby = str.split(",");
		
		for(int i = 0 ; i < hobby.length ; i++)
		{
			System.out.println(hobby[i]);
		}
		
		String str2 = "수영/골프/독서/조깅/게임";
		String[] arr1 = str2.split("/");
		for(int i = 0 ; i < arr1.length ; i++)
		{
			System.out.println(arr1[i]);
		}

		String str3 = "수영 골프 독서 조깅 게임";
		String[] arr2 = str3.split(" ");
		for(int i = 0 ; i < arr2.length ; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String str4 = "자바-파이썬-C-자바스크립트-리액트";
		
		String[] arr3 = str4.split("-");
		for(int i = 0 ; i < arr3.length ; i++)
		{
			System.out.println(arr3[i]);
		}
		
	}

}
