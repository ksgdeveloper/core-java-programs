package javatechie.lambdademo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		integers.stream().forEach(t -> System.out.print(t + " "));
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		System.out.println();
		map.forEach((k,v) -> System.out.println(k+"="+v));
		map.entrySet().stream().forEach(o -> System.out.print( o + " "));
		
	}

}
