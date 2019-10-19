package Display;

import Observer.Observer;
import WeatherStation.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Expect weather conditions improvement. Warmth is on the way");
        } else if (currentPressure == lastPressure) {
            System.out.println("In the near future, the weather will remain unchanged");
        } else if (currentPressure < lastPressure) {
            System.out.println("Conditions deterioration. Watch out for cooler, rainy weather");
        }
    }
}