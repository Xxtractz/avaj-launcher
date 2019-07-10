package Weather;

import Aircraft.Flyable;

import java.util.ArrayList;

public abstract class Tower {
    private ArrayList<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable){
        observers.add(flyable);

    }

    public void unregister(Flyable flyable){
        observers.remove(flyable);

    }

    protected void conditionsChanged() throws Exception{
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateConditions();
        }

    }
}
