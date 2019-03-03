package com.foxminded.creational.factory_method;

public class SimplePizzaFactory {

    public static Pizza createPizza(String pizzaName) {
        if ("cheese".equalsIgnoreCase(pizzaName)) {
            return new CheesePizza();
        } else if ("pepperoni".equalsIgnoreCase(pizzaName)) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Pizza store has not pizza with such name: " + pizzaName);
        }
    }

}
