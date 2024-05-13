package DecoratorDesignPatterns.Features;

import DecoratorDesignPatterns.Decorator.PizzaDecorator;
import DecoratorDesignPatterns.Pizza.Pizza;

public class Toppings extends PizzaDecorator{

    private Pizza pizza;

    public Toppings(Pizza pizza){
        System.out.println("Adding Toppings");
        this.pizza = pizza;
    }
    
    @Override
    public int count() {
        return this.pizza.count() + 30;
    }
    
}
