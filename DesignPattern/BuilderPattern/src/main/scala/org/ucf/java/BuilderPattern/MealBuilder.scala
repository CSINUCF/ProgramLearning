package org.ucf.java.BuilderPattern

class MealBuilder {
  def prepareVegMeal():Meal = {
    val meal = new Meal
    meal.addItem(new VegBurger)
    meal.addItem(new Coke)
    meal
  }
  def prepareNonVegMeal():Meal = {
    val meal = new Meal
    meal.addItem(new ChickenBurger)
    meal.addItem(new Pepsi)
    meal
  }
}
