package org.patterns.creational.abstractfactory;

import org.patterns.creational.abstractfactory.app.Application;
import org.patterns.creational.abstractfactory.factories.GUIFactory;
import org.patterns.creational.abstractfactory.factories.MacOSFactory;
import org.patterns.creational.abstractfactory.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    public static Application configureApplication() {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Application application = configureApplication();
        application.paint();
    }
}
