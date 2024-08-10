package br.com.builder.meal.after.builder;

public class JustFriesBuilder extends FastFoodMealBuilder{

  @Override
  public void buildSide() {
    meal.setSide("Large Fries");
  }
  
}
