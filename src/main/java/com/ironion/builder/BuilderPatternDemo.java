package com.ironion.builder;

/**
 * @author ironion
 * @date 2022/6/13 16:26
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("you got veg meal now...");
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("you got chicken meal now...");
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());
    }
}
