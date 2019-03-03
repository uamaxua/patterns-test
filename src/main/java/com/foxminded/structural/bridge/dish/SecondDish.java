package com.foxminded.structural.bridge.dish;

import com.foxminded.structural.bridge.kitchen.Kitchen;

public class SecondDish extends Dish {

    public SecondDish(Kitchen kitchen) {
        super(kitchen);
    }

    public void createDish() {
        System.out.print("Second dish was created by ");
        kitchen.prepareDish();
        System.out.print(" kitchen");
        System.out.println();
    }

}
