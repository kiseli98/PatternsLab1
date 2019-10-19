package DisplayFactory;

import Display.*;
import WeatherStation.WeatherData;

public class DisplayFactory {
    public DisplayElement create(DisplayType serviceName, WeatherData data) {
        switch (serviceName) {
            case CURRENT:
                return new CurrentConditionsDisplay(data);
            case FORECAST:
                return new ForecastDisplay(data);
            case HEATINDEX:
                return new HeatIndexDisplay(data);
            case STATS:
                return new StatisticsDisplay(data);
            default:
                return null;
        }
    }
}