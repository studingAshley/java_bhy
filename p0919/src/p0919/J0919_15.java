package p0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J0919_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int read=0;
		try {
			FileInputStream fis1 = new FileInputStream("C:/aaa/lee1.jpg");
			FileInputStream fis2 = new FileInputStream("C:/aaa/lee2.jpg");

			FileOutputStream fos1 = new FileOutputStream("C:/bbb/lee1.jpg");
			FileOutputStream fos2 = new FileOutputStream("C:/bbb/lee2.jpg");
			

			
			while(-1<(read=fis1.read()))
			{
				fos1.write(read);
			}
			read = 0 ;
			while(-1<(read=fis2.read()))
			{
				fos2.write(read);
			}
			
			fis1.close();
			fis2.close();
			fos1.close();
			fos2.close();
			
			System.out.println("파일복사");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
		{
			
		}


	}

}
