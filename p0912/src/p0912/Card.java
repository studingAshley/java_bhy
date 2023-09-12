package p0912;

public class Card {
	String kind;
	int number;
	String[] CardShape = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s, %s]", kind, CardShape[number-1]);
	}
	
public Card() {
	// TODO Auto-generated constructor stub
}

Card(String kind, int number)
{
	this.kind = kind;
	this.number = number;
}

public String[] getCardShape() {
	return CardShape;
}
public String getKind() {
	return kind;
}

public int getNumber() {
	return number;
}

public void setCardShape(String[] cardShape) {
	CardShape = cardShape;
}

public void setKind(String kind) {
	this.kind = kind;
}

public void setNumber(int number) {
	this.number = number;
}
}
