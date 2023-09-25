package p0920;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J0920_outputStream {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("C:/aaa/22.txt");
			
			String str = "1,hong,100,100,100,300,100.0,1\r\n";
			str += "2,you,100,100,100,300,100.0,1\r\n";
			byte[] bytes = str.getBytes();//문자열을 1byte씩 배열 형태로 리턴
			for(byte b : bytes)
			{
				fos.write(b);
			}
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}
		System.out.println("파일을 저장합니다.");
	}

}
