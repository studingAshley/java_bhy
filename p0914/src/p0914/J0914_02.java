package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public J0914_02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd hh시 mm분 ss초");
		System.out.println(d);
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));

		Calendar cal = Calendar.getInstance();
		System.out.println(sdf1.format(cal.getTime()));
	}

}
