/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.mac;

import domein.Button;
import domein.GuiFactory;
import domein.Label;

/**
 *
 * @author florian
 */
public class MacFactory extends GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Label createLabel() {
        return new MacLabel();
    }
    
}
