package concepts;

public class CalculatorClass{
	private int a;
	private int b;

	CalculatorClass(int a, int b)
	{
	this.a=a;
	this.b=b;
	}

	public int getA() {
	return a;
	}
	public void setA(int a) {
	this.a = a;
	}



	public int getB() {
	return b;
	}
	public void setB(int b) {
	this.b = b;
	}

	public static void addition(CalculatorClass cl)
	{
	int c= cl.getA()+cl.getB();
	System.out.println(cl.getA()+" + "+cl.getB()+" = " +c);
	}


	public static void subtract(CalculatorClass cl)
	{
	int c= cl.getA()-cl.getB();
	System.out.println(cl.getA()+" - "+cl.getB()+" = " +c);
	}


	public static void multiplication(CalculatorClass cl)
	{
	int c= cl.getA() *cl.getB();
	System.out.println(cl.getA()+" * "+cl.getB()+" = " +c);
	}


	public static void division(CalculatorClass cl)
	{
	int c= cl.getA()/cl.getB();
	System.out.println(cl.getA()+" / "+cl.getB()+" = " +c);
	}



	public static void main(String[] args) {

	CalculatorClass cl=new CalculatorClass(21,22);
	addition(cl);
	subtract(cl);
	multiplication(cl);
	division(cl);

	}
	}
