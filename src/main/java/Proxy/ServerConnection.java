package Proxy;

public interface ServerConnection {
    public WeatherServer connectTo(String serverhost) throws Exception;
}
