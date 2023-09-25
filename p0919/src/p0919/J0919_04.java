package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class J0919_04 {

	public static void main(String[] args) {
		File f = new File("C:\\download\\aaa.txt");
		
		
		if(!f.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("파일이 생성되었습니다.");

		
		try {
			FileWriter fw = new FileWriter(f); // 한글자씩 떼어서 입력 
			BufferedWriter writer = new BufferedWriter(fw); // 한줄씩 입력
			writer.write("Hello Hello Hell Go to Hell\r\nSecond line\r\n"); //\r : 줄의 꿑으로 이동
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// main()

}
