package dev.lieno;

public class Lavoratore implements Runnable {

    private String name;
    private Contatore count;

    public Lavoratore(String name, Contatore count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        while (count.incrementa(name)) {
            try {
                Thread.sleep((int)(Math.random()*400+100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
