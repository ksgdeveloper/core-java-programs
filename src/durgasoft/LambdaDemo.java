package durgasoft;

public class LambdaDemo {
	public static void main(String[] args) {
		HelloWorld hw = (s) -> s;
		System.out.println(hw.show("Hello World using String Arguments"));
		
		Sum sum = (a,b) -> a+b;
		System.out.println(sum.add(10, 20));
	}
}

@FunctionalInterface
interface HelloWorld{
	public String show(String s);
}

@FunctionalInterface
interface Sum{
	int add(int a, int b);
}