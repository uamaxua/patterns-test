package com.foxminded.creational.factory_method;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza pizza = SimplePizzaFactory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
