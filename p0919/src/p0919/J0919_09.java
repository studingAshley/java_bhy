package p0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class J0919_09 {

	public static void main(String[] args) {
		
		//1.바이트씩 읽어서 출력
		try {
			InputStream is = new FileInputStream("C:/aaa/1.txt");
			
			int read =0;
			while(-1<(read=is.read()))
			{
				System.out.print((char)read);
			//	read = is.read();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
//		boolean isloop = true;
//		try {
//			byte[] b = new byte[1024];
//			InputStream is = new FileInputStream("C:/aaa/1.txt"); // 바이트단위로 데이터를 읽음
//			while(0<is.read(b))
//			{
//				is.read(b);
//	
//				System.out.print(new String(b));
//			}
//			
//			
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
