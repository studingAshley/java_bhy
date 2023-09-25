package p0920;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class J0920_InputStream {

	public static void main(String[] args) {
		
		
		//byte 배열단위로 가져옴.
		byte[] b = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream("C:/aaa/11.txt");
			int read = 0 ;
			
			while(-1 <(read = fis.read(b)))
			{
				System.out.println(new String(b));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}
		
		
		//1byte 단위로 가져옴 
//		try {
//			InputStream fis = new FileInputStream("C:/aaa/11.txt");
//			int read = 0 ;
//			while(-1<(read=fis.read()))
//			{
//				System.out.print((char)read);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch(IOException e)
//		{
//			
//		}
		

	}

}
