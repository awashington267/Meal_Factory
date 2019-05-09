package com.company.german;

import com.company.Meal;

public class Lunch implements Meal {

    private String description;

    public Lunch() {
        description = "Currywurst";
    }

    @Override
    public void displayMeal() {
        System.out.println(description);
    }
}
