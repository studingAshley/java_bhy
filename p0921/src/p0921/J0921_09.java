package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollAction ca = new CollAction();
		
//		ArrayList<Card> list = ca.setInsert();
		
//		for(int i = 0 ; i < list.size() ; i++)
//		{
//			System.out.println(list.get(i).getNumber()+","+list.get(i).getKind());
//		}
		
//		ArrayList<StuScore> ssList = ca.scoreAll();
//		
//		for(int i = 0 ; i < ssList.size() ; i++)
//		{
		
//			System.out.println(ssList.get(i).getStuNum()+","+ ssList.get(i).getName()+","+ssList.get(i).getKor()+","+ssList.get(i).getEng()+","+ssList.get(i).getMath()+","+ssList.get(i).getTotal()+","+ssList.get(i).getAvg());
//		}
		


		HashMap<String, Object> map = ca.carAndScore();
		
		ArrayList<StuScore> list = (ArrayList<StuScore>)map.get("list");
		ArrayList<Car> list2 = (ArrayList<Car>)map.get("list2");
		
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.println(list.get(i).getStuNum()+","+ list.get(i).getName()+","+list.get(i).getKor()+","+list.get(i).getEng()+","+list.get(i).getMath()+","+list.get(i).getTotal()+","+list.get(i).getAvg());
		}
		
		for(int i = 0 ; i < list2.size() ; i++)
		{
			System.out.println(list2.get(i));
		}
	}

}
