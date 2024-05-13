package DecoratorDesignPatterns.Features;

import DecoratorDesignPatterns.Decorator.PizzaDecorator;
import DecoratorDesignPatterns.Pizza.Pizza;

public class Cheese extends PizzaDecorator{

    private Pizza pizza;

    public Cheese(Pizza pizza){
        System.out.println("Adding Cheese");
        this.pizza = pizza;
    }

    @Override
    public int count() {
        return this.pizza.count() + 10;
    }
    
}
