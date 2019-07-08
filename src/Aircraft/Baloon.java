package Aircraft;



public class Baloon extends Aircraft implements Flyable
{
    private WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditionds() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
