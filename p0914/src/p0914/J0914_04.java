package p0914;

public class J0914_04 {

	public static void main(String[] args) {

		Buyer b1 = new Buyer("aaa", "Hong");
//		System.out.printf("%s balance : %d \n",b1.name, b1.money);
		
		b1.buy(new Tv());
		b1.buy(new Tv());
		b1.buy(new Tv());
		
		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.buy(new Washing());
		
//		System.out.printf("%s balance : %d\n",b1.name,b1.money);
		
		System.out.println("Size of a cart : "+b1.cart.size()
		);
		System.out.println("The list of goods");
		for(int i = 0 ; i < b1.cart.size();i++)
		{
			if( b1.cart.get(i) instanceof Tv)
			{
				System.out.println(((Tv)b1.cart.get(i)));
			}
			else if(b1.cart.get(i) instanceof Computer)
			{
				System.out.println(((Computer)b1.cart.get(i)));
			}
			else if(b1.cart.get(i) instanceof Audio)
			{
				System.out.println(((Audio)b1.cart.get(i)));
				
			}
			else if(b1.cart.get(i) instanceof Washing)
			{
				System.out.println(((Washing)b1.cart.get(i)));
				
			}
		}
		
	
		System.out.println("￦");
	}

}
