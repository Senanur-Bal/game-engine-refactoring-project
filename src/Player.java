import java.util.ArrayList;
import java.util.List;

public class Player {

    private int health = 100;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setHealth(int health) {
        this.health = health;
        notifyObservers();
    }

    public int getHealth() {
        return health;
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(health);
        }
    }
}