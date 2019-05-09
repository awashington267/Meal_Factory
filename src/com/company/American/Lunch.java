package com.company.American;
import com.company.Meal;

public class Lunch implements Meal{

    private String description;

    public Lunch() {
        description = "Burger";
    }

    @Override
    public void displayMeal() {
        System.out.println(description);
    }
}
