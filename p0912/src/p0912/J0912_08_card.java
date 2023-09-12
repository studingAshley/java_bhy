package p0912;

public class J0912_08_card {

	public static void main(String[] args) {

		Deck d= new Deck();
		
		d.printCard();
		d.shuffle();
		System.out.println("======================");
		d.printCard();

		System.out.println("========================");
		System.out.println("Picked a card");
		System.out.println(d.pick(3));
		System.out.println("Picked a card randomly");
		System.out.println(d.pick());

	
	}
	
}
