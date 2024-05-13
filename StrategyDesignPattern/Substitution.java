package StrategyDesignPattern;

public class Substitution {

}

// SubstitutionDesign pattern
// Like dependency inversion

interface DriveInterface{
    void drive();
}

class SuperDrive implements DriveInterface{

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        
    }
    
}

class NormalDrive implements DriveInterface{

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        
    }
    
}

class Vehicle{
    private DriveInterface driveInterfaceObj;

    Vehicle(){}

    Vehicle(DriveInterface driveInterface){
        this.driveInterfaceObj = driveInterface;
    }
    
    public void move(){ this.driveInterfaceObj.drive();}
}

class Aulto extends Vehicle{
    public Aulto(DriveInterface driveInterface){
        super(driveInterface);
    }
}
//  Vehicle v = new Aulto(new NormalDrive());
//  v.move();

