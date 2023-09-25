package p0921;

import java.util.ArrayList;
import java.util.Vector;

public class J0921_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(new Card(1,"Spade"));
		list.add(new Card(2,"Spade"));
		list.add(new Card(3,"Spade"));
		list.add(new Card(4,"Spade"));
		list.add(new Card(5,"Spade"));
	
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
