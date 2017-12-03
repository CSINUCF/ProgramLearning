package org.ucf.java.BuilderPattern

class BuilderPatternDemo extends org.scalatest.FunSuite {
  test("uses MealBuider to demonstrate builder pattern"){
    val mealBuilder = new MealBuilder
    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total Cost: " + vegMeal.getCost())

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("\n\nNon-Veg Meal")
    nonVegMeal.showItems()
    println("Total Cost: " + nonVegMeal.getCost())
  }

}
