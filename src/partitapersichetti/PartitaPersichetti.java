/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partitapersichetti;

/**
 *
 * @author B045_02
 */
public class PartitaPersichetti  {

    public static void main(String[] args) {
        Giocatore giocatore1 = new Giocatore("Giocatore1");
        Giocatore giocatore2 = new Giocatore("Giocatore2");


        giocatore1.start();
        giocatore2.start();

        try {
            giocatore1.join();
            giocatore2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Partita terminata!");
    }
}
