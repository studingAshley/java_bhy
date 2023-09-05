package p0901;

public class JA0901_05 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double  shortPi = (int)(pi * 1000)/1000.0;
		
		System.out.println("pi : " + pi);
		System.out.println("shortPi : "+shortPi);

		double d = 123.15235678;
		double shortd = (int)(d*10000)/10000.0;
		
		System.out.println("d : "+d);
		System.out.println("shortd : "+shortd);
		
		double a = 2563.12121245;
		double a2 = (int)(a*100)/100.0;
		
		System.out.println("a : "+ a );
		System.out.println("a2 : " + a2);
		
		System.out.println("--------------------");
		
		double n = 12.598;
		double n2 = 2.321;
		System.out.println("n : "+ Math.round(n));
		System.out.println("n2 : "+ Math.ceil(n2));
		System.out.println("n : " + Math.floor(n));
		
		System.out.println((Math.round(n*10)/10.0));
		
		double x = 156.7854294;
		System.out.println((Math.round(x * 1000)/1000.0));
	}
}
