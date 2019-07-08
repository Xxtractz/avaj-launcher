package Aircraft;

import Weather.WeatherTower;

public interface Flyable
{
    public void updateConditionds();
    public void registerTower(WeatherTower weatherTower);
}
