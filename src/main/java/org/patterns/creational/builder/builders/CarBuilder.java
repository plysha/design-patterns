package org.patterns.creational.builder.builders;

import org.patterns.creational.builder.cars.Car;
import org.patterns.creational.builder.cars.CarType;
import org.patterns.creational.builder.components.Engine;
import org.patterns.creational.builder.components.GpsNavigator;
import org.patterns.creational.builder.components.Transmission;
import org.patterns.creational.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(seats, type, engine, transmission, tripComputer, gpsNavigator);
    }
}
