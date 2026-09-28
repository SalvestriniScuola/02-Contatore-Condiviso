package dev.lieno;

public class Main {
    public static void main(String[] args) {
        Contatore count = new Contatore(10);

        Thread t1 = new Thread(new Lavoratore("Marco", count));
        Thread t2 = new Thread(new Lavoratore("Nizar", count));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }


    }
}