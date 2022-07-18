package dev.nicholassouza.app.models.machines;

import dev.nicholassouza.app.models.products.Chocolate;
import dev.nicholassouza.app.models.products.HotDrink;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DrinkMachine {
    private List<HotDrinkMachine> machines = new ArrayList<>();



    public DrinkMachine(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        ChocolateMachine chocolateMachine = new ChocolateMachine();
        TeaMachine teaMachine = new TeaMachine();
        machines.add(coffeeMachine);
        machines.add(chocolateMachine);
        machines.add(teaMachine);
    }
    public void prepare() throws IOException {
        System.out.println("Escolha sua bebida:");
        System.out.println("0. Coffee");
        System.out.println("1. Chocolate");
        System.out.println("2. Tea");
        System.out.println("Escolha: ");

        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int valor = Integer.parseInt(reader.readLine());
            System.out.println("Valor informado pelo usuario:  "+ valor);
            if(valor < machines.size() && valor >= 0){
                HotDrink hotDrink = this.machines.get(valor).makeDrink();
                System.out.println(hotDrink);
            } else {
                System.out.println("Opcao nao disponivel! Tente novamente!");
            }

        }
//        for (int i = 0; i < this.machines.size(); i++) {
//            HotDrink hotdrink = machines.get(i).makeDrink();
//
//        }
    }
}