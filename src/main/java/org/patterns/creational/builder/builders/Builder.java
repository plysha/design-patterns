package org.patterns.creational.builder.builders;

import org.patterns.creational.builder.cars.CarType;
import org.patterns.creational.builder.components.Engine;
import org.patterns.creational.builder.components.GpsNavigator;
import org.patterns.creational.builder.components.Transmission;
import org.patterns.creational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GpsNavigator gpsNavigator);
}
