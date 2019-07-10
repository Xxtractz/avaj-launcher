package Weather;

import Aircraft.Flyable;

import java.util.ArrayList;

public abstract class Tower {
    private ArrayList<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable){

    }

    public void unregister(Flyable flyable){

    }

    protected void conditionsChanged(){

    }
}
