package p0911;

public class J0911_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card[] c = new Card[4];
		String[] name = {"Heart", "Spade","Diamond","Clover"};
		for(int i = 0 ; i < c.length ; i ++)
		{
			c[i] = new Card();
			c[i].kind = name[i];
			
			c[i].cardPrint();
			
		}
		
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 1 ;
		c1.cardPrint();
		

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		c2.cardPrint();
		

		Card c3 = new Card();
		c3.kind = "Diamond";
		c3.number = 1;
		c3.cardPrint();
		

		Card c4 = new Card();
		c4.kind = "Clover";
		c4.number = 1;
		c4.cardPrint();
	}

}
