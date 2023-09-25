package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_08 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("C:/bbb");
		f.mkdir();
		
		File fFile = new File("C:/bbb/1.txt");
			fFile.createNewFile();
			
		File f2 = new File("","C:/bbb/a.txt");
		
		f2.createNewFile();
	
	}

}
