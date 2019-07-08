package Aircraft;

import Aircraft.Aircraft;

public class Helicopter extends Aircraft implements Flyable
{
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditionds() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
