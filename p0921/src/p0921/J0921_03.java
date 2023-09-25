package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileWriter fw = new FileWriter("C:/aaa/stu2.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			ArrayList<StuScore> list = new ArrayList<StuScore>();
			Scanner scan = new Scanner(System.in);
			boolean isloop = true;
			while(isloop)
			{
				System.out.println("이름을 입력하세요(0.종료)");
				String name = scan.next();
				
				if(!name.equals("0"))
				{
					System.out.println("국어점수를 입력하세요");
					int kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요 ");
					int eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					int math = scan.nextInt();
					
					list.add(new StuScore(name,kor,eng,math));
					
				}else
				{
					isloop = false;
				}
								
			}//while
			
			//bw.write("");
			for(int i = 0 ; i < list.size() ; i++)
			{
				
				bw.write(String.format("%s,%d,%d,%d,%d,%.2f,%d\r\n", list.get(i).getName(),list.get(i).getKor(), list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(), list.get(i).getRank()));
			}
			
			bw.close();
			fw.close();
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
