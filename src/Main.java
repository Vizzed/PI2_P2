
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
        //System.out.println("Geben Sie die Groesse des Arrays ein:");
        //laenge = Integer.parseInt(br.readLine());
        //Menge m = new Menge(laenge);
        //UMenge um = new UMenge(10, 2);
        UMenge um=null;
        while (loop) {
            System.out.println("Menue:");
            System.out.println("1: add");
            System.out.println("2: size");
            System.out.println("3: print");
            System.out.println("4: erweitertes add");
            System.out.println("5: leer?");
            System.out.println("6: komplement");
            System.out.println("7: Programm beenden");
            eingabe = Integer.parseInt(br.readLine());
            switch (eingabe) {
                case 1:
                    int wert;
                    int temp;
                    System.out.println("Geben Sie einen Wert ein:");
                    wert = Integer.parseInt(br.readLine());
                    temp = um.add(wert);
                    if (temp == -1) {
                        System.out.println("Fehler!");
                    } else {
                        System.out.println("Erfolgreich!");
                    }
                    break;
                case 2:
                    System.out.println("Die Anzahl der Befüllten Felder: " + um.size());
                    break;
                case 3:
                    try{
                    System.out.println("Menge:");
                    um.print();
                    }
                    catch(NullPointerException e){
                        System.out.println("Fehler: Nullzeiger-Zugriff");
                    }
                    System.out.println("Programm läuft weiter");
                    break;
                case 4:
                    int unten;
                    int oben;
                    int err;

                    System.out.println("Geben Sie die untere Grenze ein:");
                    unten = Integer.parseInt(br.readLine());
                    System.out.println("Geben Sie die obere Grenze ein:");
                    oben = Integer.parseInt(br.readLine());
                    err = um.add(unten, oben);
                    if (err ==-1) {
                        System.out.println("Fehler!");
                    }
                    if(err==0)System.out.println("Erfolgreich!");
                    break;
                case 5:
                    boolean empty=um.leer();
                    if(empty==false)System.out.println("Die Menge ist nicht Leer.");
                    if(empty==true)System.out.println("Die Menge ist Leer");
                    break;
                case 6: 
                    System.out.println("Menge:");
                    um.print();
                    um.komplement();
                    System.out.println("neue Menge:");
                    um.print();
                    break;
                case 7:
                    loop=false;
                    break;
                default:
                    System.out.println("Ungueltige Eingabe");

                    break;
            }
        }

    }

}
