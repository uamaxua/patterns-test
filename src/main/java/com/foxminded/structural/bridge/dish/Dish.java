package com.foxminded.structural.bridge.dish;

import com.foxminded.structural.bridge.kitchen.Kitchen;

public abstract class Dish {

    protected Kitchen kitchen;

    public Dish(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public abstract void createDish();

}
