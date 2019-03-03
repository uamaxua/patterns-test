package com.foxminded.structural.bridge;


import com.foxminded.structural.bridge.dish.FirstDish;
import com.foxminded.structural.bridge.dish.SecondDish;
import com.foxminded.structural.bridge.kitchen.ItalianKitchen;
import com.foxminded.structural.bridge.kitchen.UkrainianKitchen;

public class Client {

    public static void main(String[] args) {
        FirstDish firstDish = new FirstDish(new ItalianKitchen());
        firstDish.createDish();
        SecondDish secondDish = new SecondDish(new UkrainianKitchen());
        secondDish.createDish();
    }

}
