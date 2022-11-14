package org.patterns.creational.abstractfactory.factories;

import org.patterns.creational.abstractfactory.buttons.Button;
import org.patterns.creational.abstractfactory.buttons.MacOSButton;
import org.patterns.creational.abstractfactory.checkboxes.Checkbox;
import org.patterns.creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
