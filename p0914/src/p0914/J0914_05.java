package p0914;

import java.util.ArrayList;

public class J0914_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++)
		{
			list.add(i+1);
		}
		
		list.add("String");
		list.add(5.4);
		
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
	}

}
