## PatternsLab1
This project contains implementation of the laboratory work nr 1 For Design Patterns.

During the lab the following patterns were included:
1. Singleton
2. Proxy
3. Observer 
4. Factory
#
The project is simple as it is and simulates a working weather station. 
There are several display modes that are created by factory and serve as Observers, waiting for the data to change.
As there could be only one subject in Observer one-to-many model, WeatherData subject is created via Singleton.
So is the Server, that transmits data to the subject. Connection is provided by a Proxy.
