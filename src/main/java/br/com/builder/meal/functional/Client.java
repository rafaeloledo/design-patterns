package br.com.builder.meal.functional;

import br.com.builder.meal.functional.model.FastFoodMeal;

public class Client {
  public static void main(String[] args) {
    FastFoodMeal burguerCombo = new FastFoodMeal.Builder("CheeseBurger")
              .forDrink("Coke")
              .andSide("Fries")
              .thatsAll();
    System.out.println(burguerCombo);

    FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMeal.Builder("Monster Burguer")
        .forDrink("Milk Shake")
				.andSide("Large Fries")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		System.out.println(heartAtackCombo);
  }
}
