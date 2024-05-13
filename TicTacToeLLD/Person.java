package TicTacToeLLD;

import TicTacToeLLD.Types.TypeMoves;

public class Person{
    private String name;
    private TypeMoves type;
    
    public Person(String name,TypeMoves type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public TypeMoves getType(){
        return this.type;
    }

    public void setType(String Type){
        this.type = type;
    }

}