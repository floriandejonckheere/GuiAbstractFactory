/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.mac;

import domein.Button;

/**
 *
 * @author florian
 */
public class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("I am a MacButton!");
    }
    
}
