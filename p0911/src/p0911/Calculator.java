package p0911;

public class Calculator {

	int num1;
	int num2;
	int addResult;
	int subResult;
	int multiResult;
	double divResult;
	
	Calculator()
	{
		
	}
	Calculator(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	 void calculate ()
		{
			this.addResult = this.num1 + this.num2;
			this.subResult = this.num1 - this.num2;
			this.multiResult = this.num1 * this.num2;
			this.divResult = this.num1 / (double) this.num2;
		}
	
	 void add(int num1, int num2)
	 {
		 this.addResult = num1 + num2;
	 }
	 void add()
	 {
		 this.addResult = this.num1 + this.num2;
	 }
	 
	 void add(int... nums)
	 {
		 
	 }
	
	 void add(long num1, long num2)
	 {
		 
	 }
	 
	 void add(Object obj)
	 {
		 Object cal = new Calculator();
	 }

}
