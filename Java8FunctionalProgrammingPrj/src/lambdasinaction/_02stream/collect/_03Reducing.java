package lambdasinaction._02stream.collect;

import static java.util.stream.Collectors.*;
import static lambdasinaction._02stream.collect.Dish.menu;

import java.util.stream.Collectors;

import lambdasinaction._02stream.basic1.Dish;

public class _03Reducing {

    public static void main(String ... args) {
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesWithMethodReference());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesWithoutCollectors());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesUsingSum());
    }

    //1. Collectors.reducing() 사용 - 칼로리 합
    private static int calculateTotalCalories() {
    	
    	return Dish.menu
    			.stream()
    			.collect(Collectors.reducing(0,Dish::getCalories,(a,b)->a+b));
    }
    //2. Method Reference 로 Collectors.reducing() 사용
    private static int calculateTotalCaloriesWithMethodReference() {
    	return Dish.menu
    			.stream()
    			.collect(Collectors.reducing(0,Dish::getCalories,Integer::sum));
    }
    //3.map() 사용
    private static int calculateTotalCaloriesWithoutCollectors() {
    	
    	return Dish.menu.stream()
    			.map(Dish::getCalories)
    			.reduce(Integer::sum)
    			.get();
        
    }

    //4. mapToInt() 사용
    private static int calculateTotalCaloriesUsingSum() {
        return menu.stream().mapToInt(Dish::getCalories).sum();
    }
}