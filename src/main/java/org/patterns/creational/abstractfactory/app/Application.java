package org.patterns.creational.abstractfactory.app;

import org.patterns.creational.abstractfactory.buttons.Button;
import org.patterns.creational.abstractfactory.checkboxes.Checkbox;
import org.patterns.creational.abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
