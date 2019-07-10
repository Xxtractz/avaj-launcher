package Aircraft;

import Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable
{
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = this.weatherTower.getWeather(coordinates);
        switch (weather){
            case "RAIN":
                coordinates = new Coordinates(
                  coordinates.getLongitude(),
                  coordinates.getLatitude(),
                  coordinates.getHeight()
                );
                break;
            case "FOG":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight()
                );
                break;
            case "SUN":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight()
                );
                break;
            case "SNOW":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight()
                );
                break;
            default:
                break;
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
