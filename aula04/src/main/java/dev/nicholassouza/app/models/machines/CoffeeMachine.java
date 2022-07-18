package dev.nicholassouza.app.models.machines;

import dev.nicholassouza.app.models.products.Coffee;
import dev.nicholassouza.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }

}
