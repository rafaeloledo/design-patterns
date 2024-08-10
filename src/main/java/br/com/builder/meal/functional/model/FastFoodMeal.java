package br.com.builder.meal.functional.model;

public class FastFoodMeal {
  final private String drink;
  final private String main;
  final private String side;
  final private String dessert;
  final private String gift;

  public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
    this.drink = drink;
    this.main = main;
    this.side = side;
    this.dessert = dessert;
    this.gift = gift;
  }

  public String getDrink() {
    return drink;
  }

  public String getMain() {
    return main;
  }

  public String getSide() {
    return side;
  }

  public String getDessert() {
    return dessert;
  }

  public String getGift() {
    return gift;
  }
  
  @Override
  public String toString() {
    return "Your meal is [main: " + main + ", drink: " + drink +
        ", side=" + side + ", dessert=" + dessert + ", gift=" + gift + "]";
  }

  public static class Builder {
    private String main;
    private String side;
    private String drink;
    private String dessert;
    private String gift;

    public Builder(String main) {
      this.main = main;
    }

    public Builder forDrink(String drink) {
			this.drink = drink;
			return this;
		}
		
		public Builder andSide(String side) {
			this.side = side;
			return this;
		}

		public Builder andDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder andGift(String gift) {
			this.gift = gift;
			return this;
		}

    public FastFoodMeal thatsAll() {
			return new FastFoodMeal(drink, main, side, dessert, gift);
		}
  }

}
