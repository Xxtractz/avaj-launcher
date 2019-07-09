package Weather;

import Aircraft.Coordinates;

public class WeatherTower extends Tower
{
    public String getWeather(Coordinates coordinates)
    {
        String weather = WeatherProvider.getProvider().getCurrentWeather(coordinates);
        return weather;
    }

    void changeWeather(){

    }
}
