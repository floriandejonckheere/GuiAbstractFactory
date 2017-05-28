/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.win;

import domein.Label;

/**
 *
 * @author florian
 */
public class WinLabel implements Label {

    @Override
    public void read() {
        System.out.println("I am a WinLabel!");
    }
    
}
