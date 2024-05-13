package DecoratorDesignPatterns.Pizza;

public class Maggrita extends Pizza{

    public Maggrita(){
        System.out.println("Maggrita");
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 10;
    }
    
}
