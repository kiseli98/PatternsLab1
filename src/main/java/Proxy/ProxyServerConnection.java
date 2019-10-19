package Proxy;

public class ProxyServerConnection implements ServerConnection {
    private RealServerConnection serverConnection = new RealServerConnection();
    private WeatherServer weatherServer = null;
    private static String validServerHost = "weather.org";

    public WeatherServer connectTo(String serverHost) {
        if(serverHost.equals(validServerHost)){
            weatherServer = serverConnection.connectTo(serverHost);
        } else {
            System.err.println("Access Denied");
        }
        return weatherServer;
    }

}
