package p0920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class J0920_reader {

	public static void main(String[] args) {

		//문서를 읽어올 때 사용 = 글자단위로 읽어오기에 변환이 필요없음
		try {
			FileReader fr = new FileReader("C:/aaa/22.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line == null)
			{
				System.out.println(line);
				line=br.readLine();
			}
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}
		

	}

}
