package ObserverDesignPattern.impl;

import java.util.List;

import ObserverDesignPattern.Observable;
import ObserverDesignPattern.Observer;

/**
 * ObservableImpl
 */
public class ObservableImpl implements Observable{

    private boolean available;
    List<Observer> list;

    @Override
    public void addObserver(Observer observer) {
            list.add(observer);
    }

    @Override
    public boolean getData() {
        return this.available;
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void setData() {
        this.available = !this.available;
    }

}