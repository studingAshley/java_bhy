package p0911;

public class J0911_03 {

	public static void main(String[] args) {
		int cardlength=52;		
		Card[] card = new Card[cardlength];
		String[] name = {"Heart","Spade","Diamond","Clover"};
		int result = 0 ;
		
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 13 ; j++)
			{
				card[i*13 + j]= new Card();
				card[i*13 + j].kind = name[i];
				card[i*13 + j].number = j+1;
				card[i*13 + j ].cardPrint();
			}
		}
	
	//	result = J0911_05.add(card[0].number, card[5].number);
		System.out.println("카드 숫자 합 : " + result);


		System.out.println("=============================");
		Card[] card2 = new Card[4];
		card2[0] = new Card();
		card2[1] = new Card();
		card2[2] = new Card();
		card2[3] = new Card();

		card2[0].kind = "Heart";
		card2[1].kind = "Spade";
		card2[2].kind = "Diamond";
		card2[3].kind = "Clover";

		card2[0].number = 1;
		card2[1].number = 1;
		card2[2].number = 1;
		card2[3].number = 1;

		card2[0].cardPrint();
		card2[1].cardPrint();
		card2[2].cardPrint();
		card2[3].cardPrint();
	}

}
