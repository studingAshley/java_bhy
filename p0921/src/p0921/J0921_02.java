package p0921;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_02 {
	
	public static void main(String[] args) {
		
		
		try {
			Scanner scan = new Scanner(System.in);
			FileWriter fw = new FileWriter("C:/aaa/stu1.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			ArrayList<StuScore> list = new ArrayList<StuScore>();
			boolean isloop = true;
			
			while(isloop)
			{

				System.out.println("학번을 입력하세요 (0.l 종료");
				int stuNum = scan.nextInt();
				if(stuNum != 0 )
				{
					
					System.out.println("이름을 입력하세요 ");
					String name = scan.next();
					System.out.println("국어점수를 입력하세요 ");
					int kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요 ");
					int eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요 ");
					int math = scan.nextInt();
					int total = kor + eng + math;
					double avg = total/3.0;
					int rank = 0;
					
					String data =String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", stuNum,name,kor,eng,math,total,avg,rank);
					
					System.out.println(data);
					
					String[] arrData = data.split(",");
					bw.write(data);
					bw.close();
					
					System.out.println("입력한 데이터를 파일에 저장했습니다");
					
					list.add(new StuScore(stuNum, name, kor,eng, math));
				}
				else
				{
					
					isloop=false;
				}

				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}
	}

}
