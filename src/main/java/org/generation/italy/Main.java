package org.generation.italy;

public class Main {
    public static void main(String[] args){
        ToiletPaper toiletPaper = new ToiletPaper();

        Thread defecatore= new Thread(new Persona(toiletPaper, true));
        Thread bidello= new Thread(new Persona(toiletPaper, false));
        //Thread pippo= new Thread(new Persona(toiletPaper, true));
        defecatore.start();
        //pippo.start();
        bidello.start();




    }
}
