package java8inaction.chap1;

public class ThreadLambdaDemo {

	public static void main(String[] args) {
		Runnable r2 = new Runnable(){
			public void run() {
				System.out.println("Original Hello World!");
			}
		};
		Runnable r1 = ()->  System.out.println("Lambda Hello World!"); 
		
		process(r1);
		process(r2);
		process(() -> System.out.println("Another way of hello world!"));
		
		
	}
	
	public static void process(Runnable r) {
		r.run();
	}

}
