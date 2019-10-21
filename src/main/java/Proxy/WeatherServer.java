package Proxy;

import java.util.Random;

public class WeatherServer {
    private static WeatherServer weatherServerInstance;
    private int[] temperature = {80, 82, 78};
    private int[] humidity = {65, 70, 90};
    private float[] pressure = {30.4f, 29.2f, 29.2f};

    //Singleton creation
    public static synchronized WeatherServer getInstance() {
        if (weatherServerInstance == null) {
            weatherServerInstance = new WeatherServer();
        }
        return weatherServerInstance;
    }

    //private constructor
    private WeatherServer() {
    }

    public float getTemperature() {
        int i = new Random().nextInt(temperature.length);
        return temperature[i];
    }

    public float getHumidity() {
        int i = new Random().nextInt(humidity.length);
        return humidity[i];
    }

    public float getPressure() {
        int i = new Random().nextInt(pressure.length);
        return pressure[i];
    }
}