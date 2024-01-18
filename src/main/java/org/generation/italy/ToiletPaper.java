package org.generation.italy;

public class ToiletPaper {
    private volatile boolean rotoloDisponibile = false;

    public synchronized void prendiRotolo() throws InterruptedException {
        while (!rotoloDisponibile) {
            System.out.println("Nessun rotolo disponibile. Attendere...");

            this.wait();
            System.out.println("Risveglio dal wait");
        }
        rotoloDisponibile = false;
        System.out.println("Rotolo consumato");
    }
    public synchronized void ricaricaRotolo() {

        while (!rotoloDisponibile) {
            rotoloDisponibile = true;
            this.notify();
            System.out.println("Nuovo rotolo aggiunto!");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println ("Ricarica rotolo: termina.");
    }



}
