package p0921;

import java.util.ArrayList;

public class J0921_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add(new Car("white",5));
		list.add(new Car("red",4));
		list.add(new Car("black",5));
		list.add(new Car("gray",5));
		list.add(new Car("blue",4));
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
		

	}

}
