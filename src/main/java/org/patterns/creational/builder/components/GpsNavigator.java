package org.patterns.creational.builder.components;

/**
 * Одна из фишек автомобиля.
 */
public class GpsNavigator {
    private final String route;

    public GpsNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GpsNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
