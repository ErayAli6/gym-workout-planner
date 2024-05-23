package observer;

public interface Observable {
    void subscribe(TrainerObserver observer);

    void unsubscribe(TrainerObserver observer);

    void notifyObservers();

    String getUpdate();
}
