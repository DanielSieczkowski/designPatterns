package observerPattern.weatherForecast;


import observerPattern.notifications.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
