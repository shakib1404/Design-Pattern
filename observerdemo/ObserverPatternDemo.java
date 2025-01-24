package observerdemo;
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer weatherApp = new WeatherApp();
        Observer newsChannel = new NewsChannel();

        // Register observers
        weatherStation.registerObserver(weatherApp);
        weatherStation.registerObserver(newsChannel);

        // Simulate changes in weather data
        weatherStation.setWeatherData(30.5f, 65.0f, 1012.0f);
        weatherStation.setWeatherData(28.0f, 70.0f, 1008.5f);

        // Remove one observer and update weather data
        weatherStation.removeObserver(newsChannel);
        weatherStation.setWeatherData(25.0f, 60.0f, 1010.0f);
    }
}