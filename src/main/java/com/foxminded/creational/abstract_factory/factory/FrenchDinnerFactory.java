package com.foxminded.creational.abstract_factory.factory;

import com.foxminded.creational.abstract_factory.dish.FirstDish;
import com.foxminded.creational.abstract_factory.dish.FrenchFirstDish;
import com.foxminded.creational.abstract_factory.dish.FrenchSecondDish;
import com.foxminded.creational.abstract_factory.dish.SecondDish;

public class FrenchDinnerFactory extends AbstractDinnerFactory {

    @Override
    public FirstDish getFirstDish() {
        return new FrenchFirstDish();
    }

    @Override
    public SecondDish getSecondDish() {
        return new FrenchSecondDish();
    }
}
