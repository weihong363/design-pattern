package com.ironion.builder;

import com.ironion.builder.entity.ChickenBurger;
import com.ironion.builder.entity.Coke;
import com.ironion.builder.entity.Pesi;
import com.ironion.builder.entity.VegBurger;

/**
 * @author ironion
 * @date 2022/6/13 16:18
 */
public class MealBuilder {

    Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pesi());
        return meal;
    }

    Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
