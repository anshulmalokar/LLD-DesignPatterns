package ObserverDesignPattern;

import ObserverDesignPattern.impl.ObservableImpl;
import ObserverDesignPattern.impl.ObserverImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Process Started");
        Observable observable = new ObservableImpl();
        Observer ob1 = new ObserverImpl(observable);
        Observer ob2 = new ObserverImpl(observable);
        Observer ob3 = new ObserverImpl(observable);
        Observer ob4 = new ObserverImpl(observable);
        observable.addObserver(ob1);
        observable.addObserver(ob2);
        observable.addObserver(ob3);
        observable.addObserver(ob4);
        System.out.println("Updating the items now");
        observable.setData();
        System.out.println("Item updated");

        ob1.update();
        ob2.update();
        ob3.update();
        ob4.update();
    }
}
