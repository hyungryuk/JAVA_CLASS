package lambdasinaction._02stream.basic2;

import java.util.Optional;

import lambdasinaction._02stream.basic1.Dish;

public class _04Finding {

	public static void main(String... args) {
		if (isVegetarianFriendlyMenu()) {
			System.out.println("Vegetarian friendly");
		}

		System.out.println(isHealthyMenu());
		System.out.println(isHealthyMenu2());

		Optional<Dish> dish = findVegetarianDish();
		dish.ifPresent(d -> System.out.println(d.getName()));

		System.out.println(isVegetarianFriendlyMenu());
	}

	// 1. anyMatch
	private static boolean isVegetarianFriendlyMenu() {
		return Dish.menu.stream()
				// .anyMatch(Dish::isVegetarian);
				.anyMatch(dish -> dish.getCalories() > 900);
	}

	// 2.allMatch
	private static boolean isHealthyMenu() {

		return Dish.menu.stream().filter(dish -> dish.getCalories() <= 400).allMatch(Dish::isVegetarian);
	}

	// 3. noneMatch
	private static boolean isHealthyMenu2() {

		return Dish.menu.stream().filter(d -> d.getCalories() > 500).noneMatch(Dish::isVegetarian);
	}

	// 4. findAny
	private static Optional<Dish> findVegetarianDish() {

		return Dish.menu.stream().filter(Dish::isVegetarian).findAny();

	}

}