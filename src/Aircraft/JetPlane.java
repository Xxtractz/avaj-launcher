package Aircraft;

import Weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable
{
    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        switch (weather){
            case "RAIN":
                break;
            case "FOG":
                break;
            case "SUN":
                break;
            case "SNOW":
                break;
                default:
                    break;
        }

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
