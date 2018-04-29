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

    public int add(int wert) {
        if (array.length <= wert) {
            return -1;
        }
        array[wert] = 1;
        return 0;
    }

    public int size() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                temp++;
            }
        }
        return temp;
    }
    
    public void print(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                System.out.println(i);
            }
            
        }
    }
    
}
