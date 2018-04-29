/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wladislaw
 */
public class Menge {

    byte array[];

    public Menge(int laenge) {
        array = new byte[laenge];
        for (int i = 0; i < laenge; i++) {
            array[i] = 0;
        }
    }

    
}
