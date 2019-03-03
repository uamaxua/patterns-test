package com.foxminded.creational.abstract_factory;

import com.foxminded.creational.abstract_factory.factory.AbstractDinnerFactory;
import com.foxminded.creational.abstract_factory.factory.FrenchDinnerFactory;

public class Client {

    public static void main(String[] args) {
        AbstractDinnerFactory factory = new FrenchDinnerFactory();
        factory.getFirstDish().prepareDish();
        factory.getSecondDish().prepareDish();
    }

}
