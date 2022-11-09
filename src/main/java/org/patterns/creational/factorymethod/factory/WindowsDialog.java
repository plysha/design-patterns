package org.patterns.creational.factorymethod.factory;

import org.patterns.creational.factorymethod.buttons.Button;
import org.patterns.creational.factorymethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
