package BUILDER;


class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("SUV Engine");
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setTripComputer();
        builder.setGPS();
    }
}

