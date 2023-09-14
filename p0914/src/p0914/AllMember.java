package p0914;

import java.util.ArrayList;

public class AllMember {
	ArrayList list = new ArrayList();
	
	public AllMember()
	{
		
	}
	
	void readMember()
	{
		list.add(new Member("aaa","1111","Hong","Seoul","010-1111-1111"));
		list.add(new Member("bbb","2222","Yu","Busan","010-2222-2222"));
		list.add(new Member("ccc","3333","Lee","Daegu","010-3333-3333"));
		list.add(new Member("ddd","4444","Kang","Inchon","010-4444-4444"));
		list.add(new Member("eee","5555","Kim","Gwangju","010-5555-5555"));
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}
	
	
}
