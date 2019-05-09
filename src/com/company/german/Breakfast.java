package com.company.german;

import com.company.Meal;

public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast() {
        description = "Rashers, Pancakes and Fruit Bowl";
        calories = 355;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
}
