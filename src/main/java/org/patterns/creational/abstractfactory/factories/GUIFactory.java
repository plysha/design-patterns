package org.patterns.creational.abstractfactory.factories;

import org.patterns.creational.abstractfactory.buttons.Button;
import org.patterns.creational.abstractfactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
