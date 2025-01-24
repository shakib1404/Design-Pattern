package observerdemo;

class WeatherApp implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("WeatherApp - Temperature: " + temperature 
            + ", Humidity: " + humidity + ", Pressure: " + pressure);
    }
}
