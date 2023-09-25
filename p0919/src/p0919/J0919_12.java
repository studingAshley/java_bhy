package p0919;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class J0919_12 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/aaa/4.txt");
			String str = "Hello, World!! 안녕 123";
			byte[] bytes = str.getBytes();
			for(byte b :bytes)
			{
				os.write(b);
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}
		System.out.println("파일을 저장합니다.");
	}

}
