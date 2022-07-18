package dev.nicholassouza.app.models.machines;

import dev.nicholassouza.app.models.products.Chocolate;
import dev.nicholassouza.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine{
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
