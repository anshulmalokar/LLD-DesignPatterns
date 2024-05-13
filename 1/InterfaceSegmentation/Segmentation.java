package InterfaceSegmentation;

interface RestrauntEmployee{
    public void wash();
    public void server();
    public void cook();
}
// Now this interface segmentations says that the client must not implement any method which is not needed 
// Suppose we need to create an object for waiter
//  Now this waiter will not need to implement the wash and cook functionality.
//  This means that break the interfaces in such small pieces that no client need to implement the functionality he is not needed

class Waiter implements RestrauntEmployee{

    @Override
    public void wash() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wash'");
    }

    @Override
    public void server() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'server'");
    }

    @Override
    public void cook() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cook'");
    }
    
}

// The above implementation in wrong.

interface WaiterI{
    public void serve();
}
class WaiterImpl implements WaiterI{
    @Override public void serve() { }
}

interface Shef{
    public void cook();
}
class ShefImpl implements Shef{
    @Override public void cook() {}
}

// In this no client need to implement any extra method.
// This will also help in saving the Liksov principle which states that the child must extend the parent functionality 
// Not reduce the parent functionality.