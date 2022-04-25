package concepts;
class EvenOdd {
	private int number;

	public EvenOdd(int number) {
		
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	static void check(int number) {
		if (number % 2 == 0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");
	}

	public static void main(String[] args) {
		int number = new java.util.Scanner(System.in).nextInt();
		EvenOdd ev = new EvenOdd(number);
		check(ev.getNumber());
		
	}
}
