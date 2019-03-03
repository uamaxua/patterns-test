package com.foxminded.creational.abstract_factory.factory;

import com.foxminded.creational.abstract_factory.dish.FirstDish;
import com.foxminded.creational.abstract_factory.dish.SecondDish;

public abstract class AbstractDinnerFactory {

    public abstract FirstDish getFirstDish();

    public abstract SecondDish getSecondDish();

}
