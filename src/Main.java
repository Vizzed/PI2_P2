
import java.io.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wladislaw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int laenge;
        boolean loop = true;
        int eingabe;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Geben Sie die Groesse des Arrays ein:");
        laenge = Integer.parseInt(br.readLine());
        Menge m = new Menge(laenge);
        while (loop) {
            System.out.println("Menue:");
            System.out.println("1: add");
            System.out.println("2: size");
            System.out.println("3: print");
            eingabe = Integer.parseInt(br.readLine());
            switch (eingabe) {
                case 1:
                    int wert;
                    int temp;
                    System.out.println("Geben Sie einen Wert ein:");
                    wert = Integer.parseInt(br.readLine());
                    temp = m.add(wert);
                    if (temp == -1) {
                        System.out.println("Fehler!");
                    } else {
                        System.out.println("Erfolgreich!");
                    }
                    break;
                case 2:
                    System.out.println("Die Anzahl der Befüllten Felder: " + m.size());
                    break;
                case 3:
                    System.out.println("Menge:");
                    m.print();
                    break;
                default:
                    System.out.println("Ungueltige Eingabe");

                    break;
            }
        }

    }

}
