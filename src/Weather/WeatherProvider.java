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
        Random randweather = new Random();

        int selectWeather = 0;
        selectWeather = randweather.nextInt(4);
        return weather[selectWeather];
    }

}
