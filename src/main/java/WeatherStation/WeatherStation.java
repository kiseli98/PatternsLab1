// Implementations of the following patterns:
// Observer, Singleton, DisplayFactory, Proxy

package WeatherStation;

import Display.DisplayElement;
import Display.DisplayType;
import Display.DisplayFactory;
import Proxy.ProxyServerConnection;
import Proxy.WeatherServer;

public class WeatherStation {

    public static void main(String[] args) throws InterruptedException {
        //Singleton demo
        WeatherData weatherData = WeatherData.getInstance();

        // Factory demo
        DisplayFactory displayFactory = new DisplayFactory();
        DisplayElement currentDisplay = displayFactory.create(DisplayType.CURRENT, weatherData);
        DisplayElement statisticsDisplay = displayFactory.create(DisplayType.STATS, weatherData);
        DisplayElement forecastDisplay = displayFactory.create(DisplayType.FORECAST, weatherData);
        DisplayElement heatIndexDisplay = displayFactory.create(DisplayType.HEATINDEX, weatherData);

        // Proxy demo
        ProxyServerConnection c = new ProxyServerConnection();
        WeatherServer s = c.connectTo("weather.com");
        Thread.sleep(2000);

        // Observer demo
        s = c.connectTo("weather.org");
        if(s != null){
            weatherData.setMeasurements(s.getTemperature(), s.getHumidity(), s.getPressure());
            System.out.println();
            weatherData.setMeasurements(s.getTemperature(), s.getHumidity(), s.getPressure());
            System.out.println();
            weatherData.setMeasurements(s.getTemperature(), s.getHumidity(), s.getPressure());
        }
    }
}
