package ObserverDesignPattern;

/**
 * Observable
 */
public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void setData();
    boolean getData();

}