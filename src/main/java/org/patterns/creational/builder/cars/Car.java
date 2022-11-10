package org.patterns.creational.builder.cars;

import org.patterns.creational.builder.components.Engine;
import org.patterns.creational.builder.components.GpsNavigator;
import org.patterns.creational.builder.components.Transmission;
import org.patterns.creational.builder.components.TripComputer;


/**
 * Автомобиль — это класс продукта.
 */
public class Car {
    private double fuel = 0;
    private final int seats;
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;

    public Car(int seats,
               CarType carType,
               Engine engine,
               Transmission transmission,
               TripComputer tripComputer,
               GpsNavigator gpsNavigator) {
        this.seats = seats;
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        //bad logic because it mutate object
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
