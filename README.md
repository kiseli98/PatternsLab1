## PatternsLab1
This project contains implementation of the laboratory work nr 1 For Design Patterns.
\
Academic Group FAF-172
\
Done by: Nichita Kiselciuk, Eduard Medinschii

#
During the lab the following patterns were included:
1. Singleton
2. Proxy
3. Observer 
4. Factory
#
The project is simple as it is and simulates a working weather station that gets data from external server. WeatherData class represents an Observable subject. Once changes within the class exceed a certain threshold it sends notifications to all observers and, thus, updates them. As for this project there could be only one observable subject in Observer one-to-many model, WeatherData subject is created via Singleton.
\
\
There are several display modes that serve as Observers waiting for the data to change. All the displyas implement the same Interface so this let us to create objects without exposing the creation logic to the client and refer to the newly-created objects using a common interface, i.e. using Factory. Mode types are stored in an enum and are available to the client.
\
\
WeatherData gets info about the changes from a remote server (only one instance required, so Singeton again), what means there should be connection between them. In our simulation direct connection is impossible. That is performed via Proxy, that serves as a filter and restricts unknown connections.

#
For a better understanding please see attached .png's containing app's architecture/class diagrams. ( WeatherStationClassDependies.png, WeatherStationClassDiag.png )
