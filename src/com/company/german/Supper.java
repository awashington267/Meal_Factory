package com.company.german;

import com.company.Meal;

public class Supper implements Meal {

    private String description;
    private boolean isDelicious;

    public Supper() {
        description = "Beef Brisket";
        isDelicious = true;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
