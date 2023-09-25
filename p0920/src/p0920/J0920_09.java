package p0920;

public class J0920_09 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,100,100,300,100.0,1";
		String[] g = str.split(",");
		
		for(int i = 0 ; i <g.length ; i++)
		{
			System.out.println(g[i]);
		}
		
		int stuNum = Integer.parseInt(g[0]);
		String name = g[1];
		int kor = Integer.parseInt(g[2]);
		int eng = Integer.parseInt(g[3]);
		int math = Integer.parseInt(g[4]);
		int total = Integer.parseInt(g[5]);
		double avg = Double.parseDouble(g[6]);
		int rank = Integer.parseInt(g[7]);
		
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",stuNum,name,kor,eng,math,total,avg,rank);

	}

}
