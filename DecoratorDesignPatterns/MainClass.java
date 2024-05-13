package DecoratorDesignPatterns;

import DecoratorDesignPatterns.Features.Cheese;
import DecoratorDesignPatterns.Features.Toppings;
import DecoratorDesignPatterns.Pizza.Maggrita;
import DecoratorDesignPatterns.Pizza.Pizza;;

public class MainClass {
    public static void main(String[] args) {
        Pizza pizza = new Toppings(
            new Toppings(new Cheese(new Maggrita()))
        );
        System.out.println(pizza.count());
    }
}
