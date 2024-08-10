package br.com.builder.meal.fluent;

import br.com.builder.meal.fluent.builder.FastFoodMealBuilder;
import br.com.builder.meal.fluent.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMealBuilder("CheeseBurger")
				.andSide("Fries")
				.forDrink("Coke")
				.thatsAll();
		System.out.println(burguerCombo);

		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Monster Burguer")
				.andSide("Large Fries")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		System.out.println(heartAtackCombo);
	}
}
