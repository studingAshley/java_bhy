package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_07 {

	public static void main(String[] args) {
//		File f1 = createFile("C:/aaa/a.txt");
		File f2 = createFile("");

	}//main()

	static File createFile(String fileName)
	{
		if(fileName == null || fileName.equals(""))
		{
			System.out.println("파일 이름없음 ");
			
			fileName="C:/aaa/제목없음.txt";
			
		}
		
		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		return f;
		
	}
}
