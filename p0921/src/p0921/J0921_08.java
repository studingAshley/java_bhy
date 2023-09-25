package p0921;

import java.util.HashMap;

public class J0921_08 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap();
		
		map.put("id","aaa");
		map.put("page","11");
		map.put("count","105");
		
		System.out.println(map.get("id"));
		

	}

}
