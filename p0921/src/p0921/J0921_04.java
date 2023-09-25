package p0921;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_04 {

	public static void main(String[] args) {
		
		try
		{
			FileReader fr = new FileReader("C:/aaa/stu1.txt");
			BufferedReader br = new BufferedReader(fr);
			ArrayList<StuScore> arrList = new ArrayList<StuScore>();
			
			String line = "";
			while( null!= (line = br.readLine()))
			{
				String[] sp = line.split(",");
				System.out.println(line);

				arrList.add(new StuScore(Integer.parseInt(sp[0]),sp[1],Integer.parseInt(sp[2]),Integer.parseInt(sp[3]),Integer.parseInt(sp[4]),Integer.parseInt(sp[5]),Double.parseDouble(sp[6]),Integer.parseInt(sp[7])));
			}
			
			
			fr.close();
			br.close();
			
			FileWriter fw = new FileWriter("C:/aaa/stu1.txt",false);
			BufferedWriter bw = new BufferedWriter(fw);
			
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
					
					arrList.add(new StuScore(name,kor,eng,math));
					
				}else
				{
					isloop = false;
				}
								
			}//while
			

			for(int i = 0 ; i < arrList.size() ; i++)
			{
				
				bw.write(String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", arrList.get(i).getStuNum(),arrList.get(i).getName(),arrList.get(i).getKor(), arrList.get(i).getEng(),arrList.get(i).getMath(),arrList.get(i).getTotal(),arrList.get(i).getAvg(), arrList.get(i).getRank()));
			}
			
			bw.close();
			fw.close();
			
		}catch(IOException e)
		{
			
		}

	}

}
