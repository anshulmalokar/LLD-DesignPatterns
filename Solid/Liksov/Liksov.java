package Liksov;

interface Bike{
    public void accelerate();
    public void speed();
}

class MotorCycle implements Bike{

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
    }

    @Override
    public void speed() {
        // TODO Auto-generated method stub
    }
    
}

class Cycle implements Bike{
    public void accelerate(){
        throw new AssertionError(null, null);
    }
    public void speed(){}
}

// The principle states that the child must extend the property of the parent not narrow it down.
// Here the MotorCycle object will work fine.
// But for the Bike object the principle fails
// As it is narrowing the capablity of the parent as Cycle cannot accelerate 
// This will give errors when somewere as a paramater Bike b is being passed but the type of it is Cycle
// Then the method for accelerate will not work.