package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class JAction {

	ArrayList<Car> list = new ArrayList();
	ArrayList<StuScore> list2 = new ArrayList();
	
	JAction(){}
	
	
	HashMap<String, Object> makeMap(String[] color, int[] door, String[] name, int[] kor, int[] eng, int[] math)
	{
		HashMap<String, Object> map = new HashMap();
		
		for(int i = 0 ; i < color.length ; i++)
		{
			list.add(new Car(color[i], door[i]));
		}
		
		for(int i = 0 ; i < name.length ; i++)
		{
			list2.add(new StuScore(name[i],kor[i],eng[i],math[i]));
		}
		
		map.put("list", list);
		map.put("list2", list2);
		
		return map;
	}
//
//	ArrayList<Car> makeList(String[] color, int[] door)
//	{
//		ArrayList<Car> list = new ArrayList();
//		
//		for(int i = 0 ; i < color.length ; i++)
//		{
//			list.add(new Car(color[i],door[i]));
//		}
//		return list;
//	}
//	
//	Car makeCar(String color, int door)
//	{
//		return new Car(color, door);
//	}
//	
//	int[] cal(int n1, int n2)
//	{
//		int[] result = {n1+n2, n1-n2, n1*n2 , n1/n2};
//		return result;
//	}
//	
	
}
