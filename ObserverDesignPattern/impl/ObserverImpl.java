package ObserverDesignPattern.impl;

import ObserverDesignPattern.Observable;
import ObserverDesignPattern.Observer;

/**
 * ObserverImpl
 */
public class ObserverImpl implements Observer{

    private Observable observable;

    public ObserverImpl(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        if(this.observable.getData()){
            // notify the observer 
            // add some logic to push message to a queue to notify the user and then some other system will take that message and send notification to the observer
            System.out.println("Observer notified " + this.toString());
        }
    }
}