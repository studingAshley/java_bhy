package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {
		JAction ja = new JAction();
		int n1 = 1000;
		int n2 = 125;

		
		String[] color = {"white","red","blue"};
		int[] door = {5,4,5};
		String[] name = {"홍길동","유관순","이순신"};
		int[] kor = {100,90,80};
		int[] eng = {90,80,70};
		int[] math = {80,70,60};
		
		HashMap<String, Object> map = ja.makeMap(color, door, name, kor, eng, math);
		
		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		ArrayList<StuScore> list2 =(ArrayList<StuScore>) map.get("list2");
		

		for(int i = 0 ; i < list.size() ; i++ )
		{
			Car c = list.get(i);
			System.out.println(c.getColor()+","+c.getDoor());
		}

		
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("--------------------------------------------------------------------");
		for(int i = 0 ; i < list2.size() ; i++ )
		{
			StuScore s = list2.get(i);
			System.out.println(s.getStuNum()+"\t"+s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"+s.getMath()+"\t"+s.getTotal()+"\t"+s.getAvg()+"\t"+s.getRank());
		}
		
//		ArrayList<StuScore> sList = new ArrayList<StuScore>();
//		
		
//		ArrayList<Car> list = ja.makeList(color,door);
//		
//		for(int i = 0 ; i < list.size() ; i++)
//		{
//			Car c = list.get(i);
//			System.out.println(c.getColor()+","+c.getDoor());
//		}
		
//		String color = "white";
//		int door = 5 ;

		
		
//		Car c = ja.makeCar(color, door);
//		
//		System.out.println(c.getColor()+", "+c.getDoor());
		
		
//		String[] color = {"white","red","blue"};
//		int[] door = {5,4,5};
		
//		int[] result = ja.cal(n1, n2);
//		
//		for(int i = 0 ; i < result.length ; i++)
//		{
//			System.out.println(result[i]);
//		}

//		System.out.println(ja.cal(n1, n2));
		
		
	}

}
