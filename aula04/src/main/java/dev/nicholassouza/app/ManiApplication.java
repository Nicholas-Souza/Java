package dev.nicholassouza.app;

import dev.nicholassouza.app.models.machines.CoffeeMachine;
import dev.nicholassouza.app.models.machines.DrinkMachine;
import dev.nicholassouza.app.models.machines.TeaMachine;
import dev.nicholassouza.app.models.products.Coffee;
import dev.nicholassouza.app.models.products.Tea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManiApplication {


    public static void main(String[] args) throws IOException {

        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepare();

    }
}