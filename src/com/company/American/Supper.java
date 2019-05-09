package com.company.American;
import com.company.Meal;

public class Supper implements Meal {
    private String description;
    private boolean isDelicious;

    public Supper() {
        description = "Chicken Salad";
        isDelicious = true;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
