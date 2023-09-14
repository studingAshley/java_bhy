package p0914;
import java.util.ArrayList;
import java.util.Scanner;

public class J0914_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "";
		String pw = "";
		
		boolean isloop = true;
		
		ArrayList list = new ArrayList();
		
		list.add(new Member("aaa","1111","Hong","Seoul","010-1111-1111"));
		list.add(new Member("bbb","2222","Yu","Busan","010-2222-2222")); 
		list.add(new Member("ccc","3333","Lee","Daegu","010-3333-3333"));
		list.add(new Member("ddd","4444","Kang","Inchon","010-4444-4444"));
		list.add(new Member("eee","5555","Kim","Gwangju","010-5555-5555"));
		
		System.out.println("아이디를 입력하세요.");
		id = scan.next();
		System.out.println("패스워드를 입력하세요.");
		pw = scan.next();
		
		if(id.equals( ((Member)list.get(0)).getId()))
		{
			if(pw.equals( ((Member)list.get(0)).getPw()))
			{
				System.out.println("로그인이 되었습니다.");
			}
			
		}

	}

}
