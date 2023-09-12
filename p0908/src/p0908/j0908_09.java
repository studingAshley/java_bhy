package p0908;

public class j0908_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] types = {"Spade","Heart","Diamond","Clover"};
		Card[] card = new Card[52];

//		for(int i = 0 ; i < types.length ; i++)
//		{
//			for(int j = 0 ; j < 13; j++)
//			{
//				card[i*13+j] = new Card(types[i], j + 1);
//			}
//		}
		
		for(int i = 0 ; i < card.length ; i++)
		{
			card[i] = new Card(types[i/13],i%13+1);
		}
		
		for(int i = 0 ; i < card.length ; i++)
		{
			card[i].print_data();
		}
		

	}

}
