package p0920;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J0920_IOFIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/ccc/");
		if(f.mkdir())
		{
			System.out.println("폴더를 생성합니다.");
		}
		else
		{
			System.out.println("폴더를 생성할 수 없습니다.");
		}
		
		try {
			FileInputStream fis = new FileInputStream("C:/aaa/ko1.jpg");
			FileOutputStream fos = new FileOutputStream("C:/ccc/ko2.jpg");
			int read = 0;
			while(-1 < (read = fis.read())) //byte단위로 파일을 읽어옴 
			{
				fos.write(read);
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("다른이름으로 저장");

	}

}
