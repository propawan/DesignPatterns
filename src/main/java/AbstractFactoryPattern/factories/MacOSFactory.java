package AbstractFactoryPattern.factories;

import AbstractFactoryPattern.buttons.Button;
import AbstractFactoryPattern.buttons.MacOSButton;
import AbstractFactoryPattern.checkboxes.Checkbox;
import AbstractFactoryPattern.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
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
