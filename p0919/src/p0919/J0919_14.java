package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J0919_14 {

	public static void main(String[] args) {
		byte[] bytes;
		
		File f = new File("C:/bbb");
		if(!f.exists())
		{
			f.mkdir();
		}
		try {
			FileInputStream fis = new FileInputStream("C:/aaa/ko1.jpg");
			
			FileOutputStream fos = new FileOutputStream("C:/bbb/ko1.jpg");
			int read=0;
			while(-1<(read = fis.read()))
			{
				fos.write(read);
				System.out.printf("%x ",read);
			}
			
			fis.close();
			fos.close();
			System.out.println("파일이 복사되었습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}


	}

}
