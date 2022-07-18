package dev.nicholassouza.app.models.machines;

import dev.nicholassouza.app.models.products.HotDrink;
import dev.nicholassouza.app.models.products.Tea;



public class TeaMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
