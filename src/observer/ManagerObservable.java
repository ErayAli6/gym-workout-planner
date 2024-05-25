package observer;

public interface ManagerObservable {
    void subscribe(TrainerObserver observer);

    void unsubscribe(TrainerObserver observer);

    void notifyObservers();

    String getUpdate();
}
