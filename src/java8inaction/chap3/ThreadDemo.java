package java8inaction.chap3;

public class ThreadDemo {
	public static void main(String[] args) {
		process(()-> System.out.println("Hello World!"));
		process(()-> {});
	}
	
	public static void process(Runnable r) {
		r.run();
	}
}
