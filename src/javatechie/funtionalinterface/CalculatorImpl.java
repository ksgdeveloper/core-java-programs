package javatechie.funtionalinterface;

public class CalculatorImpl {

	public static void main(String[] args) {
		Calculator calc = (a,b) -> System.out.println("Lambda Method Demo "+(a+b));
		calc.swithcOn(10,20);
	}
}

interface Calculator{
	void swithcOn(int a, int b);
}