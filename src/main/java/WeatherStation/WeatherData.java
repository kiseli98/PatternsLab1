package WeatherStation;

import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private static WeatherData weatherDataInstance;
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private boolean changed = false;

    //Singleton creation
    public static synchronized WeatherData getInstance() {
        if (weatherDataInstance == null) {
            weatherDataInstance = new WeatherData();
        }
        return weatherDataInstance;
    }

    //private constructor
    private WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void setChanged() {
        this.changed = true;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        if(changed){
            for (Observer observer : observers) {
                observer.update(temperature, humidity, pressure);
            }
        }
        this.changed = false;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
