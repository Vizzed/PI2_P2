/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wladislaw
 */
public class UMenge extends Menge {

    public UMenge(int laenge, int wert) {
        super(laenge);
        for (int i = 0; i <= wert; i++) {
            array[i] = 1;
        }
    }

    boolean leer() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                return false;
            }
        }
        return true;
    }

    int add(int unten, int oben) {
        if (unten < 0 || array.length <= oben) {
            return -1;
        }
        for (int i = unten; i <= oben; i++) {
            array[i] = 1;
        }
        return 0;
    }

    @Override
    void komplement() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else{
                array[i]=0;
            }
        }
    }
}
