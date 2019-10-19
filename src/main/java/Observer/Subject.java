package Observer;

public interface Subject {
    void registerObserver(Observer o);
    void setChanged();
    void removeObserver(Observer o);
    void notifyObservers();
}