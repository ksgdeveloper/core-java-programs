package java8inaction.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;

public class AppleBehaviourDesignPatternDemo {

	public static void main(String[] args) {

		List<Apple> inventory = Arrays.asList(new Apple(80, "red"), new Apple(100, "red"), new Apple(100, "green"),
				new Apple(120, "green"), new Apple(150, "green"));

		/*
		 * System.out.println(filterApples(inventory, new AppleGreenColorPredicate()));
		 * inventory.sort((a1, a2) -> Integer.compare(a1.getWeight(), a2.getWeight()));
		 * // ascending order System.out.println("After Sorting Ascending");
		 * System.out.println(inventory); inventory.sort((a1, a2) ->
		 * Integer.compare(a2.getWeight(), a1.getWeight())); // descending order
		 * System.out.println("After Sorting Descending");
		 * System.out.println(inventory);
		 */
		
		inventory.sort(comparing(Apple::getWeight));
		System.out.println(inventory);
		inventory.sort(comparing(Apple::getWeight).reversed());
		System.out.println(inventory);
		inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
		System.out.println(inventory);
	}

	public static List<Apple> filterApples(List<Apple> apples, ApplePredicate p) {

		List<Apple> result = new ArrayList<>();
		for (Apple a : apples) {
			if (p.test(a)) {
				result.add(a);
			}
		}

		return result;
	}
}

class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}

}

class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
