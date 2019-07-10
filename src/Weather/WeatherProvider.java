package Weather;

import Aircraft.Coordinates;

import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = null;
    private static String [] weather = {"RAIN","FOG","SUN","SNOW"};

    private WeatherProvider(){
    }

    public static WeatherProvider getProvider(){
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        int selectWeather ;

        selectWeather = 0;
        if ((coordinates.getLongitude() > 0) && (coordinates.getLatitude() > 0) && (coordinates.getHeight() > 0)){
            Random randweather = new Random();
            selectWeather = randweather.nextInt(4);
        }
        return weather[selectWeather];
    }

}
