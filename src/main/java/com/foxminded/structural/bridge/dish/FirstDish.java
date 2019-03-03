package com.foxminded.structural.bridge.dish;

import com.foxminded.structural.bridge.kitchen.Kitchen;

public class FirstDish extends Dish {

    public FirstDish(Kitchen kitchen) {
        super(kitchen);
    }

    public void createDish() {
        System.out.print("First dish was created by ");
        kitchen.prepareDish();
        System.out.print(" kitchen");
        System.out.println();
    }

}
