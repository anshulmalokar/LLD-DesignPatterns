package DependencyInversion;

public class Dependency{

}
// Dependency Inversion principle
// Classes should depende on the interface rather than concrete classes

interface Keyboard{

}

interface Mouse{

}

class MacBook{
    private Keyboard keyboard;
    private Mouse mouse;
    public MacBook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard; this.mouse = mouse;
    }
}

// Here the class is being dependent on the interface not concrete classes which will implement those interface
