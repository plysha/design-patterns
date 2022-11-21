package org.patterns.behavioral.state;

import org.patterns.behavioral.state.ui.Player;
import org.patterns.behavioral.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
