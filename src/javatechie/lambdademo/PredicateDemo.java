package javatechie.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> t%2==0;
		System.out.println(predicate.test(9)); 
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		integers.stream().filter(predicate).forEach(t -> System.out.print( t + " "));
	}
}
