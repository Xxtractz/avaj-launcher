package Aircraft;


import Weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable
{
    private WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        switch (weather){
            case "RAIN":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight() - 5
                );
                logger.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG Its about to rain");
                break;
            case "FOG":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight() - 3
                );
                logger.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG I cant see anything");
                break;
            case "SUN":
                coordinates = new Coordinates(
                        coordinates.getLongitude() + 2,
                        coordinates.getLatitude(),
                        coordinates.getHeight() + 4
                );
                logger.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG  is very hot");
                break;
            case "SNOW":
                coordinates = new Coordinates(
                        coordinates.getLongitude(),
                        coordinates.getLatitude(),
                        coordinates.getHeight() - 15
                );
                logger.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG The SNOW its BALL TIME");
                break;
            default:

                break;
        }
        if (this.coordinates.getHeight() <= 0){
            logger.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " is landing");
            this.weatherTower.unregister(this);
            logger.addLog("Message from Tower : Baloon" + "#" + this.name  + "(" + this.id + "):"
                    + " has been unregistered");

        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        logger.addLog("Message from Tower : Baloon#" + this.name  + "(" + this.id + "):"
                + " has been registered to Weather Tower");
    }
}
