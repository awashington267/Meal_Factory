package com.company.American;
import com.company.Meal;

public class Breakfast implements Meal{
    private String description;
    private int calories;

    public Breakfast() {
        description = "Cereal";
        calories = 400;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
}
