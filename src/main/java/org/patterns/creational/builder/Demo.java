package org.patterns.creational.builder;

import org.patterns.creational.builder.builders.CarBuilder;
import org.patterns.creational.builder.builders.CarManualBuilder;
import org.patterns.creational.builder.cars.Car;
import org.patterns.creational.builder.cars.Manual;
import org.patterns.creational.builder.director.Director;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
