package com.company;

import com.company.American.AmericanMealFactory;
import com.company.german.GermanMealFactory;

public class Driver {

    public static void main(String[] args) {
        GermanMealFactory mealFactory = new GermanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();

        AmericanMealFactory mealFactory2 = new AmericanMealFactory();
        Hotel hotel2 = new Hotel(mealFactory2);
        hotel2.serveMeals();
    }
}
