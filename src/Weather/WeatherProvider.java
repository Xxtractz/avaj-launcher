package Weather;

import Aircraft.Coordinates;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = null;
    private static String [] weather = {"RAIN","FOG","SUN","SNOW"};

    private WeatherProvider(){

    }

    public static WeatherProvider getProvider(){
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        return "";
    }

}
