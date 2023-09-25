package p0921;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class J0921_07 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("basdfsdf");
		hs.add("afff");
		hs.add("ceeee");
		
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-=----------------------------");
		
		
		it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

		
		
	//	System.out.println(hs.contains("a"));
		
//		ArrayList list = new ArrayList();
//
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
//		
//		
//		Vector<Integer> v = new Vector<Integer>();
//
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		v.add(5);
//		
//		Enumeration<Integer> e = v.elements();
//		
//		while(e.hasMoreElements())
//		{
//			System.out.println(e.nextElement());
//		}
//		
//		for(int i = 0 ; i<list.size() ; i++)
//		{
//			System.out.println(list.get(i));
//		}

	}

}
