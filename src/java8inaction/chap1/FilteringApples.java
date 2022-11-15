package java8inaction.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilteringApples {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
				new Apple(80, "red"),
				new Apple(100, "red"),
				new Apple(100, "green"),
				new Apple(120, "green"),
				new Apple(150, "green"));
		
		System.out.println(inventory);
		
		System.out.println("Apples by weight > 100");
		inventory.parallelStream().filter(a -> a.getWeight() >= 100).collect(Collectors.toList()).forEach(a -> System.out.println(a));
		
		System.out.println("Apples by color green weight >= 100");
		inventory.parallelStream().filter(a -> (a.getColor().equals("green") && a.getWeight() >=100) ).collect(Collectors.toList()).forEach(a -> System.out.println(a));
		inventory.parallelStream().filter(a -> a.getColor().equals("red")).collect(Collectors.toList()).forEach(a -> System.out.println(a));
		
	}
	
	public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor()); 
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }
    
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }    
}
