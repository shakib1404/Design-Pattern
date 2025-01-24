package observerdemo;


class NewsChannel implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("NewsChannel - Temperature: " + temperature 
            + ", Humidity: " + humidity + ", Pressure: " + pressure);
    }
}