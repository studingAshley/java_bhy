package p0920;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J0920_writer {

	public static void main(String[] args) {
		//글을 저장할 때 사용
		String str = "3,Lee,100,100,100,300,100.0,1\r\n";
		str += "4,Kang,100,100,100,300,100.0,1\r\n";
		str += "5,Kim,100,100,100,300,100.0,1\r\n";
		
		try {
			FileWriter fw = new FileWriter("C:/aaa/22.txt",true); // true : 파일 마지막부분에서 이어쓰기 // false : 덮어쓰기
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(str);
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
