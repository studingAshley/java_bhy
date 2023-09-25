package p0919;

import java.io.BufferedReader;
import java.io.FileReader;

public class J0919_11 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/aaa/3.txt");
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
		
			int counter = 0 ;
			while(line != null)
			{
				System.out.println(line);
				
				String[] found = line.split(" ");
				
				for(int i = 0 ; i < found.length ; i++)
				{
					if(found[i].equals("후쿠시마"))
					{
						counter++;
					}
				}
				line = br.readLine();
			}
			
			System.out.println("Count : "+ counter);
			br.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
