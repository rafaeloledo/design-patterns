package br.com.builder.meal.fluent.builder;

import br.com.builder.meal.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
	// Mandatory
	private String main;
	
	// Optionals
	private String side;
	private String drink;
	private String dessert;
	private String gift;

	public FastFoodMealBuilder(String main) {
		this.main = main;
	}

	public FastFoodMealBuilder forDrink(String drink) {
		this.drink = drink;
		return this;
	}

	public FastFoodMealBuilder andSide(String side) {
		this.side = side;
		return this;
	}

	public FastFoodMealBuilder andDessert(String dessert) {
		this.dessert = dessert;
		return this;
	}

	public FastFoodMealBuilder andGift(String gift) {
		this.gift = gift;
		return this;
	}

	public FastFoodMeal thatsAll() {
		return new FastFoodMeal(drink, main, side, dessert, gift);
	}
}
