package org.patterns.creational.factorymethod.factory;

import org.patterns.creational.factorymethod.buttons.Button;
import org.patterns.creational.factorymethod.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
