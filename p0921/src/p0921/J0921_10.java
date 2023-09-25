package p0921;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J0921_10 {
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>>  void main(String[] args) {
		
		ColAction2 ca2 = new ColAction2();
		
		ArrayList<Card> card = ca2.CardAll();
		

	}

}
