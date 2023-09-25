package p0919;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J0919_13 {

	public static void main(String[] args) {
		String str = "";
		try {
			FileWriter fw = new FileWriter("C:/aaa/5.txt");
			fw.flush();
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0 ; i < 10 ; i++)
			{
				str += (i+1)+"번째 글을 입력 안녕하세요 \r\n";
				
			}
			
			
			bw.write(str);
			
			bw.close();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
