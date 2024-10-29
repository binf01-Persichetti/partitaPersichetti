/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partitapersichetti;

/**
 *
 * @author B045_02
 */
public class Giocatore extends Thread {
    private String nome;
    public Giocatore(String nome) {
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ping - " + nome);
            Thread.yield();
        }
    }
}
