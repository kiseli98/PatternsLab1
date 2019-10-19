package Proxy;

public class RealServerConnection implements ServerConnection {
    WeatherServer weatherServer = WeatherServer.getInstance();

    @Override
    public WeatherServer connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
        return weatherServer;
    }

    RealServerConnection(){

    }
}