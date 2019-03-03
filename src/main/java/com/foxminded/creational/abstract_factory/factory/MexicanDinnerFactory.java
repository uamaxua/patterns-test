package com.foxminded.creational.abstract_factory.factory;

import com.foxminded.creational.abstract_factory.dish.*;

public class MexicanDinnerFactory extends AbstractDinnerFactory {

    @Override
    public FirstDish getFirstDish() {
        return new MexicanFirstDish();
    }

    @Override
    public SecondDish getSecondDish() {
        return new MexicanSecondDish();
    }
}
