package DecoratorDesignPatterns.Pizza;

public class FarmHouse extends Pizza{

    public FarmHouse(){
        System.out.println("FarmHouse");
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 11;
    }
    
}
