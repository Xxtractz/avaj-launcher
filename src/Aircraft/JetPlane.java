package Aircraft;

public class JetPlane extends Aircraft implements Flyable
{
    private WeatherTower weatherTower;

    JetPlane(String name, Aircraft.Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditionds() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
