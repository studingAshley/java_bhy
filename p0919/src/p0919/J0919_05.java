package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_05 {

	public static void main(String[] args) {
		File f = new File("C:/aaa/a.txt");
		
		if(!f.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(ArithmeticException e2)
			{
				e2.printStackTrace();
			}catch(ArrayIndexOutOfBoundsException e3)
			{
				e3.printStackTrace();
			} catch(Exception e4)
			{
				
			} finally
			{
				System.out.println("예외여부에 상관없이 실행");
			}
		}

	}

}
