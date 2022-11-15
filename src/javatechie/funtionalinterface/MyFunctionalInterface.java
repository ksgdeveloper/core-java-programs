package javatechie.funtionalinterface;
@FunctionalInterface
public interface MyFunctionalInterface {
	void m1();

	default void m2() {
		System.out.println("Default method m2");
	}

	default void m3() {
		System.out.println("Default method m3");
	}
	
	default void m4() {
		System.out.println("Default method m4");
	}
}
