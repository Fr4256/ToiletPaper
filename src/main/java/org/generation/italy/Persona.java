package org.generation.italy;

public class Persona implements Runnable {
    private ToiletPaper toiletPaper;
    private boolean consuma;

    public Persona (ToiletPaper toiletPaper, boolean consuma){
        this.toiletPaper= toiletPaper;
        this.consuma = consuma;
    }

    @Override
    public void run (){
        try {
            if (consuma){
                while (true) {
                    toiletPaper.prendiRotolo();
                    Thread.sleep(1000);
                }
            } else {
                while (true) {
                    toiletPaper.ricaricaRotolo();
                    Thread.sleep(4000);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
