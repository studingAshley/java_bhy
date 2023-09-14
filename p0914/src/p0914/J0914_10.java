package p0914;

import java.util.ArrayList;

public class J0914_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member[] m = new Member[5];

		m[0] = new Member("aaa","1111","Hong","Seoul","010-1111-1111");
		m[1] = new Member("bbb","2222","Yu","Busan","010-2222-2222");
		m[2] = new Member("ccc","3333","Lee","Daegu","010-3333-3333");
		m[3] = new Member("ddd","4444","Kang","Inchon","010-4444-4444");
		m[4] = new Member("eee","5555","Kim","Gwangju","010-5555-5555");
		
		for(int i = 0 ; i < m.length ; i++)
		{
			System.out.printf("[%s,%s,%s,%s,%s]\n",m[i].getId(),m[i].getPw(), m[i].getName(), m[i].getAddress(), m[i].getPhone());
		}
		
		System.out.println("----------------------------------------");
		
		ArrayList list = new ArrayList();
		
		list.add(new Member("aaa","1111","Hong","Seoul","010-1111-1111"));
		list.add( new Member("bbb","2222","Yu","Busan","010-2222-2222"));
		list.add(new Member("ccc","3333","Lee","Daegu","010-3333-3333"));
		list.add( new Member("ddd","4444","Kang","Inchon","010-4444-4444"));
		list.add(new Member("eee","5555","Kim","Gwangju","010-5555-5555"));
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.printf("[%s,%s,%s,%s,%s]\n",((Member)list.get(i)).getId(), ((Member)list.get(i)).getPw(), ((Member)list.get(i)).getName(),((Member)list.get(i)).getAddress(), ((Member)list.get(i)).getPhone());
		}
		
		
		
	}

}
