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
                  coordinates.getLongitude() + 5,
                  coordinates.getLatitude(),
                  coordinates.getHeight()
                );
                logger.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG Its about to rain");
                break;
            case "FOG":
                coordinates = new Coordinates(
                        coordinates.getLongitude() + 1,
                        coordinates.getLatitude(),
                        coordinates.getHeight()
                );
                logger.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG I cant see anything");
                break;
            case "SUN":
                coordinates = new Coordinates(
                        coordinates.getLongitude() + 10,
                        coordinates.getLatitude(),
                        coordinates.getHeight() + 2
                );
                logger.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG  is very hot");
                break;
            case "SNOW":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight() - 12
                );
                logger.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG The SNOW its BALL TIME");
                break;
            default:
                break;
        }
        if (this.coordinates.getHeight() <= 0){
            logger.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " is landing");
            this.weatherTower.unregister(this);
            logger.addLog("Message from Tower : Helicopter" + "#" + this.name  + "(" + this.id + "):"
                    + " has been unregistered");

        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        logger.addLog("Message from Tower : Helicopter#" + this.name  + "(" + this.id + "):"
                + " has been registered to Weather Tower");
    }
}
