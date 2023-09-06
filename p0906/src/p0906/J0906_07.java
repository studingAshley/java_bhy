package p0906;

public class J0906_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = {1,2,3,4,5};
		int[] score2 = new int[]{1,2,3,4,5};
		int[] score3 = {1,2,3,4,5};
		int[] score4 = new int[]{1,2,3,4,5};
		int[] num = new int[] {2,3,4};
		
		System.out.println(num[2]);
		num  = score;
		
		for(int i = 0; i < score.length ; i++)
		{
			System.out.println(score[i]);
		}
		score2 = score4;
		score = score2;

		System.out.println(score);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(num[4]);
	}

}
